package ee.bcs.koolitus.muisikratt2.spring_app.service;

import ee.bcs.koolitus.muisikratt2.spring_app.entity.MuisData;
import ee.bcs.koolitus.muisikratt2.spring_app.repository.MuisDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MuisDataService {

    @Autowired
    private MuisDataRepository muisDataRepository;

    public List<MuisData> getAllMuisDatas() {
        return muisDataRepository.findAll();
    }

}