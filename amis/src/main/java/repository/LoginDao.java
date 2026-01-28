package repository;

import entity.Login;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LoginDao {

    private List<Login> logins = new ArrayList<>();

    public void insertLogin(Login login) {
        logins.add(login);
        System.out.println("Login ajouté: " + login);
    }

    public Login findByLogin(String nom) {
        for (Login login : logins) {
            if (login.getNom().equals(nom)) {
                return login;
            }
        }
        return null;
    }

    public List<Login> findAll() {
        return logins;
    }

    public boolean isValid(String nom, String password) {
        Login login = findByLogin(nom);
        if (login != null && login.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}