package entity;

import org.springframework.beans.factory.annotation.Value;

public class Ville {

    @Value("Lille")
    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
