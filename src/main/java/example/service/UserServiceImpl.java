package example.service;

import example.models.User;
import example.repositories.UsersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UsersDAO usersDAO;

    @Autowired
    public UserServiceImpl(UsersDAO usersRepository) {
        this.usersDAO = usersRepository;
    }

    @Override
    public List<User> index() {
        return usersDAO.index();
    }

    @Override
    public User show(int id) {
        return usersDAO.show(id);
    }

    @Override
    @Transactional
    public void save(User person) {
        usersDAO.save(person);
    }

    @Override
    @Transactional
    public void update(User updatedPerson) {
        usersDAO.update(updatedPerson);
    }

    @Override
    @Transactional
    public void delete(int id) {
        usersDAO.delete(id);
    }
}
