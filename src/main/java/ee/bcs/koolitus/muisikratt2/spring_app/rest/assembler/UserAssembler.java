package ee.bcs.koolitus.muisikratt2.spring_app.rest.assembler;

import ee.bcs.koolitus.muisikratt2.spring_app.rest.resource.UserResource;
import ee.bcs.koolitus.muisikratt2.spring_app.entity.User;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class UserAssembler {

  public Iterable<UserResource> toResources(final List<User> users) {
    List<UserResource> resources = new ArrayList<>();
    users.stream().forEach((user) -> {
      resources.add(
              UserResource.builder()
              .firstName(user.getFirstName())
              .lastName(user.getLastName())
              .email(user.getEmail())
              .build()
      );
    });
    return resources;
  }

}
