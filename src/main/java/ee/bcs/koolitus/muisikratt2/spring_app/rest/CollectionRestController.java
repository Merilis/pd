package ee.bcs.koolitus.muisikratt2.spring_app.rest;

import ee.bcs.koolitus.muisikratt2.spring_app.entity.Collection;
import ee.bcs.koolitus.muisikratt2.spring_app.rest.assembler.CollectionAssembler;
import ee.bcs.koolitus.muisikratt2.spring_app.rest.resource.CollectionResource;
import ee.bcs.koolitus.muisikratt2.spring_app.service.CollectionService;
import ee.bcs.koolitus.muisikratt2.spring_app.service.DiscussionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/rest-api/collections")
public class CollectionRestController {

    @Autowired
    private CollectionService collectionService;
    @Autowired
    private CollectionAssembler collectionAssembler;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<CollectionResource> list() {
        return collectionAssembler.toResources(collectionService.getAllCollections());
    }

}
