package s.safontseva.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import s.safontseva.springsecurity.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
