package service;

import entity.Customer;

import java.util.List;

public interface CustomerService {
    void saveCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Customer getCustomerById(int id);
    Customer getCustomerByName(String name);
    void deleteCustomer(int id);
    int countCustomers();
}
