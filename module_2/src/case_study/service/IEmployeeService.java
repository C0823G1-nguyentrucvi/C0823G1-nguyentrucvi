package case_study.service;

import case_study.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();

    void save(Employee employee);

    Employee findByCode(String code);

    void remove(Employee employee);

    void update(Employee employee);
}
