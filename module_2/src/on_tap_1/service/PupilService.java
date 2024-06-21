package on_tap_1.service;

import on_tap_1.model.Lecturers;
import on_tap_1.model.Pupil;
import on_tap_1.repository.IPupilRepository;
import on_tap_1.repository.PupilRepository;

import java.util.List;

public class PupilService implements IPupilService {
    private final IPupilRepository iPupilRepository = new PupilRepository();

    @Override
    public List<Pupil> getAllPupil() {
        return iPupilRepository.getAllPupil();
    }

    @Override
    public void addPu(Pupil pupil) {
        iPupilRepository.addPu(pupil);
    }

    @Override
    public Pupil findById(Integer id) {
        return iPupilRepository.findById(id);
    }
}
