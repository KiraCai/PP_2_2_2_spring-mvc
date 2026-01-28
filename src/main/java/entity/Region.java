package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Region {

    @Value("ile de France")
    private String nomRegion;

    @Autowired
    private Pays pays;

    @Autowired
    private Ville capitaleRegion;

    public void affiche() {
        System.out.println("Region = " + nomRegion
                + " | Pays = " + pays.getNom()
                + " | Capitale = " + capitaleRegion.getNom());
    }
}
