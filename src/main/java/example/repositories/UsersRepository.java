package example.repositories;

import example.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UsersRepository {
    List<User> index();
    User show(int id);
    void save(User person);
    void update(User updatedPerson);
    void delete(int id);
}
