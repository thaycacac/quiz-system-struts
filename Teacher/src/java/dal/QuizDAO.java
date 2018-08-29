package dal;

import db.DBContext;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Thaycacac
 */
public class QuizDAO {
    public String getTitleQuizSession(int id) {
        Connection con = null;
        DBContext db = new DBContext();
        try {
            con = db.getConnection();
            Statement stmt = con.createStatement();
            String sql = "SELECT title FROM quiz WHERE id = " + id;
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String title = rs.getString(1);
                return title;
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
