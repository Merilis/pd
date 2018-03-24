package ee.bcs.koolitus.muisikratt2.spring_app.rest;

import ee.bcs.koolitus.muisikratt2.spring_app.entity.Part;
import ee.bcs.koolitus.muisikratt2.spring_app.rest.assembler.PartAssembler;
import ee.bcs.koolitus.muisikratt2.spring_app.rest.resource.PartResource;
import ee.bcs.koolitus.muisikratt2.spring_app.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/rest-api/parts")
public class PartRestController {

    @Autowired
    private PartService partService;
    @Autowired
    private PartAssembler partAssembler;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<PartResource> list() {
        return partAssembler.toResources(partService.getAllParts());
    }

}
