package case_study.repository;

import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;

import java.util.Map;

public interface IFacilityRepository {
    void addNewVilla(Villa villa);

    void addNewHouse(House house);

    void addNewRoom(Room room);

    Map<Facility, Integer> showAll();

}
