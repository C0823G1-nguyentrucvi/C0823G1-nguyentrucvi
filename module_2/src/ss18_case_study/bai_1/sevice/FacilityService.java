package ss18_case_study.bai_1.sevice;

import ss18_case_study.bai_1.repository.FacilityRepository;
import ss18_case_study.bai_1.repository.IFacilityRepository;

public class FacilityService implements IFacilityService{
   private IFacilityRepository iFacilityRepository=new FacilityRepository();

}
