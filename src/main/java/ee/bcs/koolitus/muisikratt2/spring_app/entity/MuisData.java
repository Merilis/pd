package ee.bcs.koolitus.muisikratt2.spring_app.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "muis_data")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MuisData {

    @Id
    @Column(name = "id_local")
    private int idLocal;
    @Column(name = "muisLink")
    private String muisLink;
    @Column(name = "identifier")
    private String identifier;
    @Column(name = "essence")
    private String essence;
    @Column(name = "title")
    private String title;
    @Column(name = "person")
    private String person;
    @Column(name = "group")
    private String group;
    @Column(name = "dcTermsDate")
    private String dcTermsDate;
    @Column(name = "tookPlaceAt")
    private String tookPlaceAt;
    @Column(name = "partId")
    private int partId;
    @Column(name = "part")
    private Part part;
    @Column(name = "description")
    private String description;
    @Column(name = "id")
    private int id;
    @Column(name = "id_collection_forms_part_of")
    private int id_collection;
    @Column(name = "idExtraNote")
    private int idExtraNote;
    @Column(name = "extraNote")
    private ExtraNote extraNote;
    @Column(name = "numberOfNotes")
    private int numberOfNotes;
}
