package example.service;

import example.models.User;

import java.util.List;

public interface UserService {
    List<User> index();
    User show(int id);
    void save(User person);
    void update(User updatedPerson);
    void delete(int id);
}
