package ee.bcs.koolitus.muisikratt2.spring_app.rest.resource;

import ee.bcs.koolitus.muisikratt2.spring_app.entity.Collection;
import ee.bcs.koolitus.muisikratt2.spring_app.entity.ExtraNote;
import ee.bcs.koolitus.muisikratt2.spring_app.entity.Part;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MuisDataResource {

    private Integer idLocal;
    private String muisLink;
    private String identifier;
    private String essence;
    private String title;
    private String person;
    private String group;
    private String dcTermsDate;
    private String tookPlaceAt;
    private Integer partId;
    private Part part;
    private String description;
    private Integer id;
    private Integer collection;
    private Integer idExtraNote;
    private ExtraNoteResource extraNote;
    private Integer numberOfNotes;

}
