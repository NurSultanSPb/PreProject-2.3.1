package example.service;

import example.models.User;
import example.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UsersRepository usersRepository;

    @Autowired
    public UserServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public List<User> index() {
        return usersRepository.index();
    }

    @Override
    public User show(int id) {
        return usersRepository.show(id);
    }

    @Override
    public void save(User person) {
        usersRepository.save(person);
    }

    @Override
    public void update(int id, User updatedPerson) {
        usersRepository.update(id, updatedPerson);
    }

    @Override
    public void delete(int id) {
        usersRepository.delete(id);
    }
}
