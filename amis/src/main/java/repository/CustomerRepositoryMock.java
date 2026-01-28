package repository;

import entity.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerRepositoryMock implements CustomerRepository {

    private List<Customer> customers = new ArrayList<>();
    public CustomerRepositoryMock() {
        customers.add(new Customer(1, "Jean Dupont", "jean@email.com", "Paris"));
        customers.add(new Customer(2, "Marie Martin", "marie@email.com", "Lyon"));
        customers.add(new Customer(3, "Pierre Durand", "pierre@email.com", "Marseille"));
    }
    @Override
    public void save(Customer customer) {
        customers.add(customer);
        System.out.println("Customer sauvegardé: " + customer);
    }
    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public Customer findById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }
    @Override
    public Customer findByName(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void delete(int id) {
        Customer customer = findById(id);
        if (customer != null) {
            customers.remove(customer);
            System.out.println("Customer supprimé: " + customer);
        } else {
            System.out.println("Customer avec id=" + id + " non trouvé");
        }
    }

    @Override
    public int count() {
        return customers.size();
    }
}
