package controller;

import entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.CustomerService;

import java.util.List;

@Component
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    public void saveCustomer(int id, String name, String email, String adresse) {
        Customer customer = new Customer(id, name, email, adresse);
        customerService.saveCustomer(customer);
    }
    public void displayAllCustomers() {
        System.out.println("=== Liste de tous les customers ===");
        List<Customer> customers = customerService.getAllCustomers();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public void displayCustomerById(int id) {
        Customer customer = customerService.getCustomerById(id);
        if (customer != null) {
            System.out.println("Customer trouvé par id=" + id + ": " + customer);
        } else {
            System.out.println("Customer avec id=" + id + " non trouvé");
        }
    }

    public void displayCustomerByName(String name) {
        Customer customer = customerService.getCustomerByName(name);
        if (customer != null) {
            System.out.println("Customer trouvé par name='" + name + "': " + customer);
        } else {
            System.out.println("Customer avec name='" + name + "' non trouvé");
        }
    }

    public void deleteCustomer(int id) {
        customerService.deleteCustomer(id);
    }

    public void countCustomers() {
        int count = customerService.countCustomers();
        System.out.println("Nombre de customers: " + count);
    }
}