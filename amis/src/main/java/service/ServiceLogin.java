package service;

import entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repository.LoginDao;

import java.util.List;

@Component
public class ServiceLogin {

    @Autowired
    private LoginDao loginDao;

    public void createLogin(int id, String nom, String password) {
        Login login = new Login(id, nom, password);
        loginDao.insertLogin(login);
    }

    public boolean isValidLogin(String nom, String password) {
        return loginDao.isValid(nom, password);
    }

    public Login findByNom(String nom) {
        return loginDao.findByLogin(nom);
    }

    public List<Login> getAllLogins() {
        return loginDao.findAll();
    }
}