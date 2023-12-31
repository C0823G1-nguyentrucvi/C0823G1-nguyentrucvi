package case_study.repository;

import case_study.model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> findAll();

    void save(Employee employee);
}
