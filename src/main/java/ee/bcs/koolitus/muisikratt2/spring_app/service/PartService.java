package ee.bcs.koolitus.muisikratt2.spring_app.service;

import ee.bcs.koolitus.muisikratt2.spring_app.entity.Part;
import ee.bcs.koolitus.muisikratt2.spring_app.repository.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartService {

    @Autowired
    private PartRepository partRepository;

    public List<Part> getAllParts() {
        return partRepository.findAll();
    }

}
