package ee.bcs.koolitus.muisikratt2.spring_app.rest;

import ee.bcs.koolitus.muisikratt2.spring_app.rest.assembler.UserAssembler;
import ee.bcs.koolitus.muisikratt2.spring_app.rest.resource.UserResource;
import ee.bcs.koolitus.muisikratt2.spring_app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest-api/users")
public class UserRestController {

  @Autowired
  private UserService userService;
  @Autowired
  private UserAssembler userAssembler;

  @RequestMapping(method = RequestMethod.GET )
  public Iterable<UserResource> list() {
    return userAssembler.toResources(userService.getUsers());
  }

}
