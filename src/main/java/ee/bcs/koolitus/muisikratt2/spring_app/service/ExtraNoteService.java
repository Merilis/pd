package ee.bcs.koolitus.muisikratt2.spring_app.service;

import ee.bcs.koolitus.muisikratt2.spring_app.entity.ExtraNote;
import ee.bcs.koolitus.muisikratt2.spring_app.repository.ExtraNoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExtraNoteService {

    @Autowired
    private ExtraNoteRepository extraNoteRepository;

    public List<ExtraNote> getAllExtraNotes() {
        return extraNoteRepository.findAll();
    }

}
