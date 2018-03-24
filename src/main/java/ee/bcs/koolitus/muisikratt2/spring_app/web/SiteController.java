package ee.bcs.koolitus.muisikratt2.spring_app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SiteController {

  @RequestMapping(value = "/", method = GET)
  public ModelAndView getIndex() {
    return new ModelAndView("index");
  }

}
