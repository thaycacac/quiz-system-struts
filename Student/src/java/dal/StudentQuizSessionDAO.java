package dal;

import db.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Thaycacac
 */
public class StudentQuizSessionDAO {

    public void insertStudentQuizSession(int qsid, int stid) {
        Connection con = null;
        DBContext db = new DBContext();
        try {
            con = db.getConnection();
            String sql = "insert into StudentQuizSession (QuizSessionID, StudentID) values (?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, qsid);
            stmt.setInt(2, stid);
            stmt.executeUpdate();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return;
    }
}
