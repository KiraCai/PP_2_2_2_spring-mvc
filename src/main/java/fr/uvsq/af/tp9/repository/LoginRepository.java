package fr.uvsq.af.tp9.repository;

import fr.uvsq.af.tp9.entity.Login;
import org.springframework.data.repository.CrudRepository;


public interface LoginRepository extends CrudRepository<Login, Long> {
}
