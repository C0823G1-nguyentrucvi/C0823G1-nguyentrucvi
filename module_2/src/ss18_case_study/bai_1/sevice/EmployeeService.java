package ss18_case_study.bai_1.sevice;

import ss18_case_study.bai_1.repository.EmployeeRepository;
import ss18_case_study.bai_1.repository.IEmployeeRepository;

public class EmployeeService implements IEmployeeService{
private IEmployeeRepository iEmployeeRepository=new EmployeeRepository();
}
