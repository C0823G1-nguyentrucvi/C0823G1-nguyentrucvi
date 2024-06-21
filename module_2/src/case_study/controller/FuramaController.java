package case_study.controller;

import case_study.model.*;
import case_study.service.*;

import java.util.List;
import java.util.Map;

public class FuramaController {
    private IFacilityService iFacilityService = new FacilityService();
    private IEmployeeService iEmployeeService = new EmployeeService();
    private ICustomerService iCustomerService = new CustomerService();


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

    public Employee findByCode(String code) {
        return iEmployeeService.findByCode(code);
    }

    public void remove(Employee employee) {
        this.iEmployeeService.remove(employee);

    }

    public Customer findByCodeCustomer(String code) {

        return iCustomerService.findByCodeCustomer(code);
    }

    public void remove(String code) {
        iCustomerService.remove(code);
    }

    public void addNewVilla(Villa villa) {
        this.iFacilityService.addNewVilla(villa);
    }

    public void addNewHouse(House house) {
        this.iFacilityService.addNewHouse(house);

    }

    public void addNewRoom(Room room) {
        this.iFacilityService.addNewRoom(room);
    }

    public void update(Employee employee) {
        this.iEmployeeService.update(employee);
    }

    public void updateCustomer(Customer customer) {
        this.iCustomerService.updateCustomer(customer);
    }

    public Map<Facility, Integer> showAll() {

        return iFacilityService.showAll();
    }
}
