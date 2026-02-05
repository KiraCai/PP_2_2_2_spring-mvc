package fr.uvsq.af.tp9.service;

import fr.uvsq.af.tp9.entity.Login;

import java.util.List;

public interface LoginService {

    void save(Login login);

    List<Login> listAll();

    Login get(Long id);

    void delete(Long id);
}