package ee.bcs.koolitus.muisikratt2.spring_app.repository;


        import ee.bcs.koolitus.muisikratt2.spring_app.entity.Collection;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface CollectionRepository extends JpaRepository<Collection, Integer> {

}
