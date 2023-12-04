package case_study.repository;

import case_study.common.FileService;
import case_study.model.Employee;

import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private FileService fileService = new FileService();

    @Override
    public List<Employee> findAll() {
        return fileService.readEmployees();
    }

    @Override
    public void save(Employee employee) {
        List<Employee> employees = fileService.readEmployees();
        employees.add(employee);
        fileService.writeEmployee(employees);
    }

}
