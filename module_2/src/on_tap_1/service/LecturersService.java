package on_tap_1.service;

import on_tap_1.model.Lecturers;
import on_tap_1.repository.ILecturersRepository;
import on_tap_1.repository.LecturersRepository;
import ss10_Java_Collection_Framework.model.Product;

import java.util.List;

public class LecturersService implements ILecturersService {

    private final ILecturersRepository iLecturersRepository = new LecturersRepository();

    @Override
    public List<Lecturers> getAllLecturers() {
        return iLecturersRepository.getAllLecturers();
    }

    @Override
    public void addLec(Lecturers lecturers) {
        iLecturersRepository.addLec(lecturers);
    }

    @Override
    public Lecturers findById(Integer id) {
        return iLecturersRepository.findById(id);
    }

    @Override
    public void removelec(Integer id) {
        iLecturersRepository.removelec(id);
    }
}
