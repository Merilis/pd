package ee.bcs.koolitus.muisikratt2.spring_app.rest.assembler;

import ee.bcs.koolitus.muisikratt2.spring_app.entity.Part;
import ee.bcs.koolitus.muisikratt2.spring_app.rest.resource.PartResource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PartAssembler {

    public Iterable<PartResource> toResources(final List<Part> parts) {
        final List<PartResource> resources = new ArrayList<>();
        for (Part part : parts) {
            resources.add(
                    PartResource.builder()
                            .partId(part.getPartId())
                            .partName(part.getPartName())
                            .build());
        }
        return resources;
    }
}
