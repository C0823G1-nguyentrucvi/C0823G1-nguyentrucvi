package on_tap_1.controller;

import on_tap_1.model.Lecturers;
import on_tap_1.service.ILecturersService;
import on_tap_1.service.LecturersService;
import on_tap_1.service.LecturersService;
import ss10_Java_Collection_Framework.model.Product;

import java.util.List;

public class LecturersController {
    private static final ILecturersService iLecturersService = new LecturersService();

    public static void addLec(Lecturers lecturers) {
        iLecturersService.addLec(lecturers);
    }

    public static Lecturers findById(Integer id) {

        return iLecturersService.findById(id);
    }

    public List<Lecturers> getAllLecturers() {
        return iLecturersService.getAllLecturers();
    }

    public void removelec(Integer id) {
        iLecturersService.removelec(id);
    }
}
