package fr.uvsq.af.tp9.repository;

import fr.uvsq.af.tp9.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
