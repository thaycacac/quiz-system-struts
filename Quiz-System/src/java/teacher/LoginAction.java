package teacher;

import com.opensymphony.xwork2.ActionSupport;

/**
 * <code>Set welcome message.</code>
 */
public class LoginAction extends ActionSupport {

    public String execute() throws Exception {
        if (username.equalsIgnoreCase("admin")) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
