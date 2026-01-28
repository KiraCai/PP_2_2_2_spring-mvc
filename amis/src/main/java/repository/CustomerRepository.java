package repository;

import entity.Customer;

import java.util.List;

public interface CustomerRepository {
    void save(Customer customer);
    List<Customer> findAll();
    Customer findById(int id);
    Customer findByName(String name);
    void delete(int id);
    int count();
}
