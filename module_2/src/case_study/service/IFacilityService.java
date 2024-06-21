package case_study.service;

import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;

import java.util.Map;

public interface IFacilityService {

    void addNewVilla(Villa villa);

    void addNewHouse(House house);

    void addNewRoom(Room room);

    Map<Facility, Integer> showAll();

}
