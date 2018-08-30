package dal;

import dataobj.QuizSession;
import db.DBContext;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

/**
 *
 * @author Thaycacac
 */
public class TotalClassDAO {

    public int getNumberStudent(int quizSession) {
        Connection con = null;
        DBContext db = new DBContext();
        try {
            con = db.getConnection();
            Statement stmt = con.createStatement();
            String sql = "select count(*) from StudentQuizSession where QuizSessionID = " + quizSession + " group by QuizSessionID";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int number = rs.getInt(1);
                return number;
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public ArrayList<String> listTotal(int numberStudent, int quizSession) {
        ArrayList<String> listTotal = new ArrayList<>();
        Connection con = null;
        DBContext db = new DBContext();
        NumberFormat formatter = new DecimalFormat("#0.00");;
        try {
            con = db.getConnection();
            Statement stmt = con.createStatement();
            String sql = "select count(sqs.StudentID)from StudentQuizSession sqs, Student s, StudentQuizAnswer sqa where sqs.StudentID = s.ID and s.ID = sqa.StudentID and sqs.QuizSessionID = " + quizSession + " group by sqa.QuestionID";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                double numberCurrentQues = rs.getDouble(1);
                String processCurrentQues = formatter.format(numberCurrentQues / numberStudent * 100);
                listTotal.add(processCurrentQues);
            }
            rs.close();
            stmt.close();
            con.close();
            return listTotal;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
