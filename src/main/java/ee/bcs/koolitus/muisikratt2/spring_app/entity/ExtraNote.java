package ee.bcs.koolitus.muisikratt2.spring_app.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "extra_note")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ExtraNote {

    @Id
    @Column(name = "idExtraNote")
    private int idExtraNote;
    @Column(name = "muisLink")
    private String muisLink;
    @Column(name = "date")
    private Timestamp date;
    @Column(name = "eMail")
    private String eMail;
    @Column(name = "clientName")
    private String clientName;
    @Column(name = "extraNoteText")
    private String extraNoteText;
}
