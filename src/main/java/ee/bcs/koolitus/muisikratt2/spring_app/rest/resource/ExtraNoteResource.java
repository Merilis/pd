package ee.bcs.koolitus.muisikratt2.spring_app.rest.resource;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExtraNoteResource {

    private Integer idExtraNote;
    private String muisLink;
    private Timestamp date;
    private String eMail;
    private String clientName;
    private String extraNoteText;

}
