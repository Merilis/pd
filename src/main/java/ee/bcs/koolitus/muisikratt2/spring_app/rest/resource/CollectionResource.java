package ee.bcs.koolitus.muisikratt2.spring_app.rest.resource;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CollectionResource {

    private Integer id;
    private String collectionName;

}
