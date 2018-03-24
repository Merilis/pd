package ee.bcs.koolitus.muisikratt2.spring_app.rest.resource;

import lombok.*;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PartResource {

    private Integer partId;
    private String partName;

}
