package ma.ensias.miniprojet.Beans;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@SessionScoped
public class AuthController implements Serializable {
    private String username;
    private String password;
    private String role;

    @Inject
    UserController userController;

    public String login() {
        if ("admin".equals(username) && "admin123".equals(password)) {
            role = "admin";
            return "admin.xhtml?faces-redirect=true";
        } else if ("user".equals(username) && "user123".equals(password)) {
            role = "user";
            return userController.loadUserDetails(username);
        }
        return "error.xhtml?faces-redirect=true";
    }

    public void logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }

    public String getRole() {
        return role;
    }

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
