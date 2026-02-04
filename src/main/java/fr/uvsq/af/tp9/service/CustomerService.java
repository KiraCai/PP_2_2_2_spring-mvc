package fr.uvsq.af.tp9.service;

import fr.uvsq.af.tp9.entity.Customer;

import java.util.List;

public interface CustomerService {

    void save(Customer customer);

    List<Customer> listAll();

    Customer get(Long id);

    void delete(Long id);
}