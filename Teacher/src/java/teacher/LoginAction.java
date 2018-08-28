package teacher;

import com.opensymphony.xwork2.ActionSupport;
import dal.QuizSessionDAO;
import dal.TeacherDAO;
import dataobj.QuizSession;
import dataobj.Teacher;
import java.util.ArrayList;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 * <code>Set welcome message.</code>
 */
public class LoginAction extends ActionSupport implements SessionAware {

    Map<String, Object> session;

    private String name;

    public String execute() throws Exception {
        TeacherDAO tcDao = new TeacherDAO();
        int id = tcDao.getIdTeacher(name);
        if (id != -1) {
            Teacher teacher = new Teacher(id, name);
            session.put("teacher", teacher);

            QuizSessionDAO qsDao = new QuizSessionDAO();
            ArrayList<QuizSession> listqs = qsDao.getQuizSession(id);
            session.put("listqs", listqs);
            
            

            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
