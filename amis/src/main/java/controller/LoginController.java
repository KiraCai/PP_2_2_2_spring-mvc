package controller;

import entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.ServiceLogin;

import java.util.List;

@Component
public class LoginController {

    @Autowired
    private ServiceLogin serviceLogin;

    public void creerLogin(int id, String nom, String password) {
        serviceLogin.createLogin(id, nom, password);
    }

    public boolean verifierLogin(String nom, String password) {
        boolean valid = serviceLogin.isValidLogin(nom, password);
        if (valid) {
            System.out.println("Connexion réussie pour: " + nom);
        } else {
            System.out.println("Échec de connexion pour: " + nom);
        }
        return valid;
    }

    public void afficherTousLogins() {
        List<Login> logins = serviceLogin.getAllLogins();
        System.out.println("=== Tous les logins ===");
        for (Login login : logins) {
            System.out.println(login);
        }
    }
}