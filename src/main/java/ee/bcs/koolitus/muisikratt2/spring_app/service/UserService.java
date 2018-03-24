package ee.bcs.koolitus.muisikratt2.spring_app.service;

import ee.bcs.koolitus.muisikratt2.spring_app.entity.User;
import ee.bcs.koolitus.muisikratt2.spring_app.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public List<User> getUsers() {
    return userRepository.findAll();
  }

}
