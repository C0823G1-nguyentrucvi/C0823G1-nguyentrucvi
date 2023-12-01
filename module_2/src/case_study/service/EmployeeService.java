package case_study.service;


import case_study.model.Employee;
import case_study.repository.EmployeeRepository;
import case_study.repository.IEmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private static IEmployeeRepository iEmployeeRepository = new EmployeeRepository();

    @Override
    public List<Employee> finAll() {
        return iEmployeeRepository.finAll();
    }

    @Override
    public void finAdd() {
        iEmployeeRepository.finAdd();
    }


}
