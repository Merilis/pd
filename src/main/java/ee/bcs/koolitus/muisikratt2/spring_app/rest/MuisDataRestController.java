package ee.bcs.koolitus.muisikratt2.spring_app.rest;

import ee.bcs.koolitus.muisikratt2.spring_app.entity.MuisData;
import ee.bcs.koolitus.muisikratt2.spring_app.rest.assembler.MuisDataAssembler;
import ee.bcs.koolitus.muisikratt2.spring_app.rest.resource.MuisDataResource;
import ee.bcs.koolitus.muisikratt2.spring_app.service.MuisDataService;
import ee.bcs.koolitus.muisikratt2.spring_app.service.DiscussionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/rest-api/muis_datas")
public class MuisDataRestController {

    @Autowired
    private MuisDataService muisDataService;
    @Autowired
    private MuisDataAssembler muisDataAssembler;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<MuisDataResource> list() {
        return muisDataAssembler.toResources(muisDataService.getAllMuisDatas());
    }

}
