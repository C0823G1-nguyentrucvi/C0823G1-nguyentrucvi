package case_study.controller;

import case_study.model.Employee;
import case_study.service.*;

import java.util.List;

public class FuramaControllers {
    private static IEmployeeService iEmployeeService = new EmployeeService();
    private static ICustomerService iCustomerService = new CustomerService();

    private static IFacilityService iFacilityService = new FacilityService();

    public List<Employee> finAll() {
        return iEmployeeService.finAll();
    }

    public void finAdd() {
        iEmployeeService.finAdd();
    }
}
