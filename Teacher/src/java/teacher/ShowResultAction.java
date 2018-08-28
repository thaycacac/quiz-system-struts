package teacher;

import com.opensymphony.xwork2.ActionSupport;
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

    public ShowResultAction() {
    }

    public String execute() throws Exception {
        ResultRecordDAO rrd = new ResultRecordDAO();
        ArrayList<ResultRecord> listRR = rrd.getListResult(1);//TODO............
        session.put("listRR", listRR);

        return SUCCESS;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

}
