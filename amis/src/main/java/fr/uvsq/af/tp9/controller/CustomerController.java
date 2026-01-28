package fr.uvsq.af.tp9.controller;

import fr.uvsq.af.tp9.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import fr.uvsq.af.tp9.service.CustomerService;

import java.util.List;

@Component
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public void saveCustomer(String name, String email, String adresse) {
        Customer customer = new Customer(name, email, adresse);
        customerService.saveCustomer(customer);
    }

    public void displayAllCustomers() {
        System.out.println("=== Liste de tous les customers ===");
        List<Customer> customers = customerService.getAllCustomers();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public void displayCustomerById(Long id) {
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

    public void deleteCustomer(Long id) {
        customerService.deleteCustomer(id);
    }

    public void countCustomers() {
        long count = customerService.countCustomers();
        System.out.println("Nombre de customers: " + count);
    }
}