package case_study.repository;

import case_study.common.FileService;
import case_study.model.Customer;

import java.util.List;

public class CustomerRepository implements ICustomerRepository {

    private final FileService fileService = new FileService();

    @Override
    public List<Customer> findAllCustomer() {
        return fileService.readCustomers();
    }

    @Override
    public void save(Customer customer) {
        List<Customer> customers = fileService.readCustomers();
        customers.add(customer);
        fileService.writeCustomer(customers);
    }
}
