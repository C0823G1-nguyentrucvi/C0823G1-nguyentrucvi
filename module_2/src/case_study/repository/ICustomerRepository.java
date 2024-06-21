package case_study.repository;

import case_study.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAllCustomer();

    void save(Customer customer);


    Customer findByCodeCustomer(String code);

    void remove(String code);

    void updateCustomer(Customer customer);

}
