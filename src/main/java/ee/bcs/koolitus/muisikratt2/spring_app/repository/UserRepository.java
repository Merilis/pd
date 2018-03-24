package ee.bcs.koolitus.muisikratt2.spring_app.repository;

import ee.bcs.koolitus.muisikratt2.spring_app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);

}
