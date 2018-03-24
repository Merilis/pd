package ee.bcs.koolitus.muisikratt2.spring_app.rest;

import ee.bcs.koolitus.muisikratt2.spring_app.entity.ExtraNote;
import ee.bcs.koolitus.muisikratt2.spring_app.rest.assembler.ExtraNoteAssembler;
import ee.bcs.koolitus.muisikratt2.spring_app.rest.resource.ExtraNoteResource;
import ee.bcs.koolitus.muisikratt2.spring_app.service.ExtraNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/rest-api/extra_notes")
public class ExtraNoteRestController {

    @Autowired
    private ExtraNoteService extraNoteService;
    @Autowired
    private ExtraNoteAssembler extraNoteAssembler;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<ExtraNoteResource> list() {
        return extraNoteAssembler.toResources(extraNoteService.getAllExtraNotes());
    }

}
