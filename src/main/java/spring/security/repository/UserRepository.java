package spring.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.security.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByUsername(String username);

}
