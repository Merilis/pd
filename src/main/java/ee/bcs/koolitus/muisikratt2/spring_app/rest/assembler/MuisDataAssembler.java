package ee.bcs.koolitus.muisikratt2.spring_app.rest.assembler;

import ee.bcs.koolitus.muisikratt2.spring_app.entity.MuisData;
import ee.bcs.koolitus.muisikratt2.spring_app.rest.resource.MuisDataResource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MuisDataAssembler {

    public Iterable<MuisDataResource> toResources(final List<MuisData> muisDatas) {
        final List<MuisDataResource> resources = new ArrayList<>();
        for (MuisData muisData : muisDatas) {
            resources.add(
                    MuisDataResource.builder()
                            .idLocal(muisData.getIdLocal())
                            .muisLink(muisData.getMuisLink())
                            .identifier(muisData.getIdentifier())
                            .essence(muisData.getEssence())
                            .title(muisData.getTitle())
                            .person(muisData.getPerson())
                            .group(muisData.getGroup())
                            .dcTermsDate(muisData.getDcTermsDate())
                            .tookPlaceAt(muisData.getTookPlaceAt())
                            .partId(muisData.getPartId())
                            .part(muisData.getPart())
                            .description(muisData.getDescription())
                            .id(muisData.getId())
                            .collection(muisData.getCollection())
                            .idExtraNote(muisData.getIdExtraNote())
                            .extraNote(muisData.getExtraNote())
                            .numberOfNotes(muisData.getNumberOfNotes())
                            .build());
        }
        return resources;
    }
}
