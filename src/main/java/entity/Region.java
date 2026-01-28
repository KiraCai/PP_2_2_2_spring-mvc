package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Region {

    @Value("ile de France")
    private String nomRegion;

    @Autowired
    private Ville capitaleRegion;

    @Autowired
    private Ville megaPole;

    @Autowired
    private Pays pays;

    public void affiche() {
        System.out.println("Region = " + nomRegion
                + " | Pays = " + pays.getNom()
                + " | Capitale = " + capitaleRegion.getNom()
                + " | MegaPole = " + megaPole.getNom());
    }
}
