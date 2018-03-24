package ee.bcs.koolitus.muisikratt2.spring_app.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "collection")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Collection {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "collection_name")
    private String collectionName;

}
