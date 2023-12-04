package case_study.service;


import case_study.model.Customer;
import case_study.repository.*;

import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerRepository iCustomerRepository = new CustomerRepository();

    @Override
    public List<Customer> findAlls() {
        return iCustomerRepository.findAllCustomer();
    }

    @Override
    public void save(Customer customer) {
        this.iCustomerRepository.save(customer);
    }
}
