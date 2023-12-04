package case_study.controller;

import case_study.model.Customer;
import case_study.model.Employee;
import case_study.service.*;

import java.util.List;

public class FuramaController {
    private IEmployeeService iEmployeeService = new EmployeeService();
    private ICustomerService iCustomerService = new CustomerService();

    private IFacilityService iFacilityService = new FacilityService();

    public List<Employee> findAll() {
        return iEmployeeService.findAll();
    }

    public void finAdd(Employee employee) {
    }

    public void save(Employee employee) {
        this.iEmployeeService.save(employee);
    }

    public List<Customer> findAlls() {

        return this.iCustomerService.findAlls();
    }

    public void saveCustomer(Customer customer) {
        this.iCustomerService.save(customer);
    }
}
