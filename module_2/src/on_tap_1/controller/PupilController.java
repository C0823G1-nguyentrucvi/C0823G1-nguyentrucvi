package on_tap_1.controller;

import on_tap_1.model.Lecturers;
import on_tap_1.model.Pupil;
import on_tap_1.service.ILecturersService;
import on_tap_1.service.IPupilService;
import on_tap_1.service.PupilService;
import on_tap_1.service.LecturersService;

import java.util.List;

public class PupilController {

    private final IPupilService iPupilService = new PupilService();


    public List<Pupil> getAllPupil() {
        return iPupilService.getAllPupil();
    }

    public void addPu(Pupil pupil) {
        iPupilService.addPu(pupil);
    }

    public Pupil findById(Integer id) {
        return iPupilService.findById(id);
    }
}
