package case_study.service;


import case_study.repository.EmployeeRepository;
import case_study.repository.IEmployeeRepository;

public class CustomerService implements ICustomerService {
    private static IEmployeeRepository iEmployeeRepository=new EmployeeRepository();
}
