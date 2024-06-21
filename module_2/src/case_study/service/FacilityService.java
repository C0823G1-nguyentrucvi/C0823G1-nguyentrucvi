package case_study.service;

import case_study.model.Facility;
import case_study.model.House;
import case_study.model.Room;
import case_study.model.Villa;
import case_study.repository.FacilityRepository;
import case_study.repository.IFacilityRepository;

import java.util.Map;

public class FacilityService implements IFacilityService {
    private static IFacilityRepository iFacilityRepository = new FacilityRepository();

    @Override
    public void addNewVilla(Villa villa) {
        iFacilityRepository.addNewVilla(villa);
    }

    @Override
    public void addNewHouse(House house) {
        iFacilityRepository.addNewHouse(house);
    }

    @Override
    public void addNewRoom(Room room) {
        iFacilityRepository.addNewRoom(room);
    }

    @Override
    public Map<Facility, Integer> showAll() {
        return iFacilityRepository.showAll();
    }
}
