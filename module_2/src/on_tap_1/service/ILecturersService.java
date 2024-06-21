package on_tap_1.service;

import on_tap_1.model.Lecturers;
import ss10_Java_Collection_Framework.model.Product;

import java.util.List;

public interface ILecturersService {


    List<Lecturers> getAllLecturers();

    void addLec(Lecturers lecturers);

    Lecturers findById(Integer id);

    void removelec(Integer id);

}
