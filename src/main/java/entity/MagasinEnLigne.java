package entity;

import javax.swing.*;
import java.util.List;

public class MagasinEnLigne {
    private final String nom;
    private Livraison livraison;
    private List<Option> options;
    public MagasinEnLigne(String nom) {
        this.nom = nom;
    }
    public void setLivraison(Livraison livraison) {
        this.livraison = livraison;
    }
    public void setOptions(List<Option> options) {
        this.options = options;
    }
    public void affiche() {
        System.out.println("Magasin: " + nom );
        System.out.println(livraison.afficheConfiguration());


        System.out.println("Options :");
        if (options != null) {
            for (Option o : options) {
                System.out.println(" - " + o.afficheConfiguration());
            }
        }
    }
}
