package ma.ensias.miniprojet.Controller;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import ma.ensias.miniprojet.Exceptions.UserNotFoundException;
import ma.ensias.miniprojet.Model.User;
import ma.ensias.miniprojet.Service.Db;
import ma.ensias.miniprojet.Service.UserService;

import java.io.Serializable;

@Named
@SessionScoped
public class LoginController implements Serializable {
    private String username;
    private String password;
    @Inject
    //@Fake
    @Db
    UserService us;

    public String login() {
        User mUser;
        try {
            mUser = us.authenticate(username,password);
            if(mUser.getRole().equals("ADMIN")){
                return "admin.xhtml?faces-redirect=true";
            }
            return "user.xhtml?faces-redirect=true";
        } catch (UserNotFoundException e) {
            return "error.xhtml?faces-redirect=true";
        }
    }

    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "login.xhtml?faces-redirect=true";
    }




    // getters and setters

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
