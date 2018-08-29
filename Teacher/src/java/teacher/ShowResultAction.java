package teacher;

import com.opensymphony.xwork2.ActionSupport;
import dal.QuizDAO;
import dal.QuizSessionDAO;
import dal.ResultRecordDAO;
import dataobj.ResultRecord;
import java.util.ArrayList;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Thaycacac
 */
public class ShowResultAction extends ActionSupport implements SessionAware {

    Map<String, Object> session;
    private int quizsessionid;

    public String execute() throws Exception {
        ResultRecordDAO rrd = new ResultRecordDAO();
        
        QuizDAO qdao = new QuizDAO();
        String title = qdao.getTitleQuizSession(quizsessionid);
        session.put("title", title);
        
        ArrayList<ResultRecord> listRR = rrd.getListResult(quizsessionid);
        session.put("listRR", listRR);

        return SUCCESS;
    }

    public int getQuizsessionid() {
        return quizsessionid;
    }

    public void setQuizsessionid(int quizsessionid) {
        this.quizsessionid = quizsessionid;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

}
