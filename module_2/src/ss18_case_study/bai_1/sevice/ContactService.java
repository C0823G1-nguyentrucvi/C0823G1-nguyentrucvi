package ss18_case_study.bai_1.sevice;

import ss18_case_study.bai_1.repository.ContactRepository;
import ss18_case_study.bai_1.repository.IContactRepository;

public class ContactService implements IContactService{
    private IContactRepository iContactRepository=new ContactRepository();

}
