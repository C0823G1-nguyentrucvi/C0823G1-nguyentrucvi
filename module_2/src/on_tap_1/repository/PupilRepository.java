package on_tap_1.repository;

import on_tap_1.model.Lecturers;
import on_tap_1.model.Pupil;
import ss10_Java_Collection_Framework.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PupilRepository implements IPupilRepository {
    private List<Pupil> pupils = new ArrayList<>();

    {
        pupils.add(new Pupil(1, "m221", "vi", LocalDate.of(2004, 12, 7), "c1", 2.5));
    }

    @Override
    public List<Pupil> getAllPupil() {
        return pupils;
    }

    @Override
    public void addPu(Pupil pupil) {
        pupils.add(pupil);
    }

    @Override
    public Pupil findById(Integer id) {
        for (Pupil pu : pupils) {
            if (pu.getId().equals(id)) {
                return pu;
            }
        }
        return null;
    }
}
