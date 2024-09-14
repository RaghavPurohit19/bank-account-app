package project.banking_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.banking_app.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
