package ma.ensias.miniprojet.Service;

import jakarta.enterprise.context.SessionScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ma.ensias.miniprojet.Exceptions.UserNotFoundException;
import ma.ensias.miniprojet.Model.User;

import java.io.Serializable;
import java.util.List;

@Db
@SessionScoped
public class JpaUserService implements Serializable,UserService{
    User loggedUser = new User();

    @PersistenceContext(unitName = "User")
    private EntityManager em;
    @Override
    public List<User> getAllUsers() {
          return em.createQuery("SELECT u FROM User u", User.class).getResultList();
    }
    @Override
    public void addUser(User user) {
          em.persist(user);

    }
    @Override
    public void updateUser(User user) {
         em.merge(user);
    }
    @Override
    public void deleteUser(User user) {
         em.remove(em.contains(user) ? user : em.merge(user));
    }

    @Override
    public User authenticate( String username, String password) throws UserNotFoundException {
        try {
            loggedUser =  em.createQuery("SELECT u FROM User u where u.username = :usname and u.password = :pass", User.class)
                    .setParameter("usname",username)
                    .setParameter("pass",password)
                    .getSingleResult();
            return loggedUser;
        }catch (Exception e){
            throw new UserNotFoundException();
        }
    }

    @Override
    public User getLoggedUser(){
        return loggedUser;
    }
}
