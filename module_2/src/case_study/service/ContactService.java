package case_study.service;

import case_study.repository.ContactRepository;
import case_study.repository.IContactRepository;

public class ContactService implements IContactService {
    private static IContactRepository iContactRepository=  new ContactRepository();
}
