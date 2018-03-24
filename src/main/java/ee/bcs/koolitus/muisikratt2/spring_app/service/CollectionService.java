package ee.bcs.koolitus.muisikratt2.spring_app.service;

import ee.bcs.koolitus.muisikratt2.spring_app.entity.Collection;
import ee.bcs.koolitus.muisikratt2.spring_app.repository.CollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionService {

    @Autowired
    private CollectionRepository collectionRepository;

    public List<Collection> getAllCollections() {
        return collectionRepository.findAll();
    }

}
