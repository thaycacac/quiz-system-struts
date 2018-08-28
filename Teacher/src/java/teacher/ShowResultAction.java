package teacher;

import com.opensymphony.xwork2.ActionSupport;
import dal.ResultRecordDAO;
import dataobj.ResultRecord;
import java.util.ArrayList;
import java.util.Map;
import javax.servlet.http.HttpSession;
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
        System.out.println(quizsessionid);
        System.out.println("abcd");

        ArrayList<ResultRecord> listRR = rrd.getListResult(1);//TODO............
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
