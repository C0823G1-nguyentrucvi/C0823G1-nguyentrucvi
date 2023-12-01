package case_study.service;

import case_study.repository.FacilityRepository;
import case_study.repository.IFacilityRepository;

public class FacilityService implements IFacilityService{
    private static IFacilityRepository iFacilityRepository=new FacilityRepository();
}
