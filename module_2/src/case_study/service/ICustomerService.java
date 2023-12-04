package case_study.service;

import case_study.model.Customer;

import java.util.List;

public interface ICustomerService {


    List<Customer> findAlls();

    void save(Customer customer);
}
