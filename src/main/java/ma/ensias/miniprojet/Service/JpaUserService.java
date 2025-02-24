package ma.ensias.miniprojet.Service;

import ma.ensias.miniprojet.Model.User;

import java.io.Serializable;
import java.util.List;

public class JpaUserService implements Serializable,UserService{

    //  @PersistenceContext(unitName = "UserPU")
    //private EntityManager em;
    @Override
    public List<User> getAllUsers() {
        //  return em.createQuery("SELECT u FROM User u", User.class).getResultList();
        return null;
    }
    @Override
    public void addUser(User user) {
        //  em.persist(user);

    }
    @Override
    public void updateUser(User user) {
        // em.merge(user);
    }
    @Override
    public void deleteUser(User user) {
        // em.remove(em.contains(user) ? user : em.merge(user));
    }

    @Override
    public User authenticate(String username, String password) {
        return null;
    }

    @Override
    public User getLoggedUser() {
        return null;
    }
}
