package on_tap_1.repository;

import on_tap_1.model.Lecturers;
import on_tap_1.model.Pupil;

import java.util.List;

public interface IPupilRepository {
    List<Pupil> getAllPupil();

    void addPu(Pupil pupil);

    Pupil findById(Integer id);

}
