package student;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Thaycacac
 */
public class EnterRoomAction extends ActionSupport {
    
    private String roomname;
    
    public String execute() throws Exception {
        return SUCCESS;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }
    
}
