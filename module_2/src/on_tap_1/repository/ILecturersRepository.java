package on_tap_1.repository;

import on_tap_1.model.Lecturers;
import ss10_Java_Collection_Framework.model.Product;

import java.util.List;

public interface ILecturersRepository {


    List<Lecturers> getAllLecturers();

    void addLec(Lecturers lecturers);

    Lecturers findById(Integer id);

    void removelec(Integer id);

}
