package case_study.repository;

import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;

import java.util.*;

public class FacilityRepository implements IFacilityRepository {
    LinkedHashMap<Facility, Integer> linkedHashMap = new LinkedHashMap<>();

    @Override
    public void addNewVilla(Villa villa) {
        linkedHashMap.put(villa, 0);
    }

    @Override
    public void addNewHouse(House house) {
        linkedHashMap.put(house, 0);
    }

    @Override
    public void addNewRoom(Room room) {
        linkedHashMap.put(room, 0);
    }

    @Override
    public Map<Facility, Integer> showAll() {
        return linkedHashMap;
    }


}
