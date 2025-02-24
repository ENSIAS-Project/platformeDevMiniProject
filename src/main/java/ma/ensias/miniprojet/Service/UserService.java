package ma.ensias.miniprojet.Service;

import jakarta.ejb.Stateless;
import ma.ensias.miniprojet.Model.User;

import java.io.Serializable;
import java.util.List;

@Stateless
public class UserService implements Serializable {
  //  @PersistenceContext(unitName = "UserPU")
    //private EntityManager em;

    public List<User> getAllUsers() {
      //  return em.createQuery("SELECT u FROM User u", User.class).getResultList();
        return null;
    }

    public void addUser(User user) {
      //  em.persist(user);

    }

    public void updateUser(User user) {
       // em.merge(user);
    }

    public void deleteUser(User user) {
       // em.remove(em.contains(user) ? user : em.merge(user));
    }

    public User findByUsername(String username) {
        return new User();
    }
}
