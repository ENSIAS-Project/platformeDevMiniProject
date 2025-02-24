package ma.ensias.miniprojet.Service;

import jakarta.enterprise.context.SessionScoped;
import ma.ensias.miniprojet.Exceptions.UserNotFoundException;
import ma.ensias.miniprojet.Model.User;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@SessionScoped
public class FakeUserService implements Serializable,UserService {

  List<User> users;
  User loggedUser;
  public FakeUserService(){
    users = new ArrayList<>();
    users.add(new User(1,"anas","elb","anas","el bouziyani", Calendar.getInstance().getTime(),2000.0,"n21 av riad","FES","50000","MAROC","ADMIN"));
    users.add(new User(2,"test","test","anas","el bouziyani", Calendar.getInstance().getTime(),2000.0,"n21 av riad","FES","50000","MAROC","USER"));
  }

    @Override
    public List<User> getAllUsers() {
        return users;
    }
    @Override
    public void addUser(User user) {
        users.add(user);
    }
    @Override
    public void updateUser(User newuser) {
        users.iterator().forEachRemaining(olduser -> {
          if(olduser.getId().equals(newuser.getId())){
            olduser.setAdresse(newuser.getAdresse());
            olduser.setNom(newuser.getNom());
            olduser.setPrenom(newuser.getPrenom());
            olduser.setDateNaissance(newuser.getDateNaissance());
            olduser.setSoldeCompte(newuser.getSoldeCompte());
            olduser.setAdresse(newuser.getAdresse());
            olduser.setVille(newuser.getVille());
            olduser.setCodePostal(newuser.getCodePostal());
            olduser.setPays(newuser.getPays());
            olduser.setRole(newuser.getRole());
          }
        });
    }
    @Override
    public void deleteUser(User user) {
    users.remove(user);
    }

  @Override
  public User authenticate(String username, String password) throws UserNotFoundException {
    for (User selectedUser : users) {
      if(selectedUser.getUsername().equals(username) && selectedUser.getPassword().equals(password)){
        loggedUser = selectedUser;
        return selectedUser;
      }
    }
    throw new UserNotFoundException();
  }

  @Override
  public User getLoggedUser() {
    return this.loggedUser;
  }

}
