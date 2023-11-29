package ss18_case_study.bai_1.sevice;

import ss18_case_study.bai_1.repository.CustomerRepository;
import ss18_case_study.bai_1.repository.ICustomerRepository;

public class CustomerService implements ICustomerService{
    private ICustomerRepository iCustomerRepository=new CustomerRepository();
}
