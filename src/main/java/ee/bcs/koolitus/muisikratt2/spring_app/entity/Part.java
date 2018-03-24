package ee.bcs.koolitus.muisikratt2.spring_app.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "part")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Part {

    @Id
    @Column(name = "partId")
    private int partId;
    @Column(name = "partName")
    private String partName;
}
