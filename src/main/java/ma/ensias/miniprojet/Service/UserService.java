package ma.ensias.miniprojet.Service;


import ma.ensias.miniprojet.Exceptions.UserNotFoundException;
import ma.ensias.miniprojet.Model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(User user);
    public User authenticate(String username , String password) throws UserNotFoundException;
    public User getLoggedUser();
}
