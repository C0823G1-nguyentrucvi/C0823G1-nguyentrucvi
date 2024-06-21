package case_study.repository;

import case_study.common.FileService;
import case_study.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private List<Employee> employees = new ArrayList<>();


    private FileService fileService = new FileService();

    @Override
    public List<Employee> findAll() {
        return fileService.readEmployees();
    }

    @Override
    public void save(Employee employee) {
        employees = fileService.readEmployees();
        employees.add(employee);
        fileService.writeEmployee(employees);
    }

    @Override
    public Employee findByCode(String code) {
        employees = fileService.readEmployees();
        for (Employee employee : employees) {
            if (employee.getCode().equals(code)) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
        fileService.writeEmployee(employees);
    }

    @Override
    public void update(Employee e) {
        employees = fileService.readEmployees();
        for (Employee employee : employees) {
            if (employee.getCode().equals(e.getCode())) {
                employee.setName(e.getName());
                employee.setDate(e.getDate());
                employee.setIdentity(e.getIdentity());
                employee.setPhoneNumber(e.getPhoneNumber());
                employee.setGmail(e.getGmail());
                employee.setLevel(e.getLevel());
                employee.setPosition(e.getPosition());
                employee.setMoney(e.getMoney());
                break;
            }
        }
        fileService.writeEmployee(employees);
    }
}
