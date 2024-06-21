package case_study.service;

import case_study.model.Customer;

import java.util.List;

public interface ICustomerService {


    List<Customer> findAlls();

    void save(Customer customer);

    Customer findByCodeCustomer(String code);

    void remove(String code);

    void updateCustomer(Customer customer);

}
