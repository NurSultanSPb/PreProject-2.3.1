package example.repositories;

import example.models.User;

import java.util.List;

public interface UsersDAO {
    List<User> index();
    User show(int id);
    void save(User person);
    void update(User updatedPerson, int id);
    void delete(int id);
}
