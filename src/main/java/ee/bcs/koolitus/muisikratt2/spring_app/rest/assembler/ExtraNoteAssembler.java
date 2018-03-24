package ee.bcs.koolitus.muisikratt2.spring_app.rest.assembler;

import ee.bcs.koolitus.muisikratt2.spring_app.entity.ExtraNote;
import ee.bcs.koolitus.muisikratt2.spring_app.rest.resource.ExtraNoteResource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ExtraNoteAssembler {

    public Iterable<ExtraNoteResource> toResources(final List<ExtraNote> extraNotes) {
        final List<ExtraNoteResource> resources = new ArrayList<>();
        for (ExtraNote extraNote : extraNotes) {
            resources.add(
                    ExtraNoteResource.builder()
                            .idExtraNote(extraNote.getIdExtraNote())
                            .muisLink(extraNote.getMuisLink())
                            .date(extraNote.getDate())
                            .eMail(extraNote.getEMail())
                            .clientName(extraNote.getClientName())
                            .extraNoteText(extraNote.getExtraNoteText())
                            .build());
        }
        return resources;
    }
}
