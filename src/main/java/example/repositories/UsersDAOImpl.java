package example.repositories;

import example.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UsersDAOImpl implements UsersDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> index() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public User show(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void save(User person) {
        entityManager.persist(person);
    }

    @Override
    public void update(User updatedPerson) {
        entityManager.merge(updatedPerson);
    }

    @Override
    public void delete(int id) {
        entityManager.remove(show(id));
    }
}
