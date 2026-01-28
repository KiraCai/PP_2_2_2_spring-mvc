package entity;

import org.springframework.beans.factory.annotation.Value;

public class Pays {

    @Value("France")
    private String nom;

    public Pays() {
        System.out.println("Un pays est créé");
    }

    public String getNom() {
        return nom;
    }
}
