package dal;

import dataobj.QuizSession;
import db.DBContext;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Thaycacac
 */
public class QuizSessionDAO {

    public ArrayList<QuizSession> getQuizSession(int teacherId) {
        ArrayList<QuizSession> listqs = new ArrayList<>();
        Connection con = null;
        DBContext db = new DBContext();
        try {
            con = db.getConnection();
            Statement stmt = con.createStatement();
            String sql = "select qs.id, qs.Code, qs.QuizID, qs.StartedBy, "
                    + "qs.StartedDate, qs.EndDate, qs.IsInProgress, q.Title\n"
                    + "from quizsession qs\n"
                    + "inner join Quiz q\n"
                    + "on qs.QuizID = q.ID \n"
                    + "where qs.StartedBy = " + teacherId;
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt(1);
                String code = rs.getString(2);
                int quizId = rs.getInt(3);
                int startedBy = rs.getInt(4);
                Date startedDate = rs.getDate(5);
                Date endDate = rs.getDate(6);
                boolean isInProgress = rs.getBoolean(7);
                String title = rs.getString(8);
                QuizSession qs = new QuizSession(id, code, quizId, startedBy, startedDate, endDate, isInProgress, title);
                listqs.add(qs);
            }
            rs.close();
            stmt.close();
            con.close();
            return listqs;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
