package example.service;

import example.models.User;
import example.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UsersRepository usersRepository;

    @Autowired
    public UserServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    @Transactional
    public List<User> index() {
        return usersRepository.findAll();
    }

    @Override
    @Transactional
    public User show(int id) {
        Optional<User> foundUser = usersRepository.findById(id);
        return foundUser.orElse(null);
    }

    @Override
    @Transactional
    public void save(User person) {
        usersRepository.save(person);
    }

    @Override
    @Transactional
    public void update(int id, User updatedPerson) {
        User toBeUpdated = show(id);
        toBeUpdated.setName(updatedPerson.getName());
        toBeUpdated.setSurname(updatedPerson.getSurname());
        toBeUpdated.setCity(updatedPerson.getCity());
        toBeUpdated.setAge(updatedPerson.getAge());
        usersRepository.save(toBeUpdated);
    }

    @Override
    @Transactional
    public void delete(int id) {
        usersRepository.deleteById(id);
    }
}
