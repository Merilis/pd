package ee.bcs.koolitus.muisikratt2.spring_app.repository;


import ee.bcs.koolitus.muisikratt2.spring_app.entity.ExtraNote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtraNoteRepository extends JpaRepository<ExtraNote, Integer> {

}
