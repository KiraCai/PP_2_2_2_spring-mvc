package fr.uvsq.af.tp9.service;


import fr.uvsq.af.tp9.entity.Customer;
import fr.uvsq.af.tp9.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repo;

    @Override
    public void save(Customer customer) {
        repo.save(customer);
    }

    @Override
    public List<Customer> listAll() {
        return (List<Customer>) repo.findAll();
    }

    @Override
    public Customer get(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
