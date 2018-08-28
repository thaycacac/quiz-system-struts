package dal;

import dataobj.ResultRecord;
import db.DBContext;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Thaycacac
 */
public class ResultRecordDAO {

    public ArrayList<ResultRecord> getListResult(int quizSessionId) {
        ArrayList<ResultRecord> getListResult = new ArrayList<>();
        Connection con = null;
        DBContext db = new DBContext();
        try {
            con = db.getConnection();
            Statement stmt = con.createStatement();
            String sql = "select sqs.ID, sqs.QuizSessionID, sqs.StudentID, st.Name from \n"
                    + "StudentQuizSession sqs\n"
                    + "inner join Student st\n"
                    + "on sqs.StudentID = st.ID";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt(1);
                int questionId = rs.getInt(2);
                int studentId = rs.getInt(3);
                String name = rs.getString(4);
                ArrayList<Boolean> listAns = listAns(studentId);
                ResultRecord rr = new ResultRecord(id, questionId, studentId, name, listAns);
                getListResult.add(rr);
            }
            rs.close();
            stmt.close();
            con.close();
            return getListResult;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ArrayList<Boolean> listAns(int studentId) {
        ArrayList<Boolean> listAns = new ArrayList<>();
        Connection con = null;
        DBContext db = new DBContext();
        try {
            con = db.getConnection();
            Statement stmt = con.createStatement();
            String sql = "select\n"
                    + "case when qq.QuestionID = sqa.QuestionID \n"
                    + "then 1 else 0\n"
                    + "end as 'done'\n"
                    + "from QuestionQuiz qq\n"
                    + "left outer join StudentQuizAnswer sqa\n"
                    + "on qq.QuestionID = sqa.QuestionID\n"
                    + "and qq.QuizID = sqa.QuizID\n"
                    + "and StudentID = " + studentId;
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                listAns.add(rs.getBoolean(1));
            }
            rs.close();
            stmt.close();
            con.close();
            return listAns;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
