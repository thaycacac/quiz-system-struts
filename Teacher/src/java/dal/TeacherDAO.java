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
public class TeacherDAO {

    public int getIdTeacher(String name) {
        Connection con = null;
        DBContext db = new DBContext();
        try {
            con = db.getConnection();
            Statement stmt = con.createStatement();
            String sql = "select id from Teacher where name = '" + name + "'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt(1);
                return id;
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }
}
