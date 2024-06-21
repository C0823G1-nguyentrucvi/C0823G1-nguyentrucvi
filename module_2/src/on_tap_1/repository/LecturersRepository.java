package on_tap_1.repository;

import on_tap_1.model.Lecturers;
import on_tap_1.model.Pupil;
import on_tap_1.service.ILecturersService;
import ss10_Java_Collection_Framework.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LecturersRepository implements ILecturersRepository {
    private static List<Lecturers> lecturerss = new ArrayList<>();

    {
        lecturerss.add(new Lecturers(1, "code", "tham", LocalDate.of(2004, 12, 7), true, "sinh"));
        lecturerss.add(new Lecturers(2, "code", "tiuvi", LocalDate.of(2004, 12, 7), true, "hoa"));
    }

    @Override
    public List<Lecturers> getAllLecturers() {
        return lecturerss;
    }

    @Override
    public void addLec(Lecturers lecturers) {
        lecturerss.add(lecturers);
    }

    @Override
    public Lecturers findById(Integer id) {
        for (Lecturers lec : lecturerss) {
            if (lec.getId().equals(id)) {
                return lec;
            }
        }
        return null;
    }

    @Override
    public void removelec(Integer id) {
        for (Lecturers lec : lecturerss) {
            if (lec.getId().equals(id)) {
                lecturerss.remove(lec);
                break;
            }
        }
    }
}
