package service;

import entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repository.CustomerRepository;

import java.util.List;

@Component
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer getCustomerByName(String name) {
        return customerRepository.findByName(name);
    }

    @Override
    public void deleteCustomer(int id) {
        customerRepository.delete(id);
    }

    @Override
    public int countCustomers() {
        return customerRepository.count();
    }
}
