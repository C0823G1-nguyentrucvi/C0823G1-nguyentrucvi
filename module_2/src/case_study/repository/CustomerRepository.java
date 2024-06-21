package case_study.repository;

import case_study.common.FileService;
import case_study.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private List<Customer> customers = new ArrayList<>();

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


    @Override
    public Customer findByCodeCustomer(String code) {
        customers = fileService.readCustomers();
        for (Customer customer : customers) {
            if (customer.getCode().equals(code)) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void remove(String code) {
        customers = fileService.readCustomers();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCode().equals(code)) {
                customers.remove(customers.get(i));
            }
        }
        fileService.writeCustomer(customers);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customers = fileService.readCustomers();
        for (Customer customer1 : customers) {
            if (customer1.getCode().equals(customer.getCode())) {
                customer1.setName(customer.getName());
                customer1.setDate(customer.getDate());
                customer1.setIdentity(customer.getIdentity());
                customer1.setCustomerType(customer.getCustomerType());
                customer1.setAddress(customer.getAddress());
                customer1.setGmail(customer.getGmail());
                customer1.setPhoneNumber(customer.getPhoneNumber());
                break;
            }
        }
        fileService.writeCustomer(customers);
    }
}
