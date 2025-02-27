package ma.ensias.miniprojet.Controller;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import ma.ensias.miniprojet.Model.User;
import ma.ensias.miniprojet.Service.UserService;

import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class UserController implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private UserService userService;
    private User selectedUser;
    private User newUser = new User();


    public void deleteUser(User user) {
        userService.deleteUser(user);
    }

    public void editUser() {

    }

    public List<User> getUserList() {
        return userService.getAllUsers();
    }

    public User getSelectedUser() {
        return selectedUser;
    }

    public void setSelectedUser(User selectedUser) {
        this.selectedUser = selectedUser;
    }

    public User getNewUser() {
        return newUser;
    }

    public void setNewUser(User newUser) {
        this.newUser = newUser;
    }

    public Object getLoggedUser() {
        return userService.getLoggedUser();
    }

    public void addUser() {
        System.out.println("addUser() method called!");
        userService.addUser(newUser);
    }
}
