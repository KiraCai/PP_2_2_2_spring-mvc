package service;

import entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CustomerRepository;

import java.util.List;
import java.util.Optional;

@Service("customerService")
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public void saveCustomer(Customer customer) {
        repository.save(customer);
        System.out.println("Customer sauvegardé: " + customer);
    }

    public List<Customer> getAllCustomers() {
        return (List<Customer>) repository.findAll();
    }

    public Customer getCustomerById(Long id) {
        Optional<Customer> customer = repository.findById(id);
        return customer.orElse(null);
    }

    public Customer getCustomerByName(String name) {
        for (Customer c : getAllCustomers()) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    public void deleteCustomer(Long id) {
        repository.deleteById(id);
        System.out.println("Customer avec id=" + id + " supprimé");
    }

    public long countCustomers() {
        return repository.count();
    }
}