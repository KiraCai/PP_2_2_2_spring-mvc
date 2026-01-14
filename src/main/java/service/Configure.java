package service;

import entity.Langue;
import entity.Systeme;

public class Configure {

    private Langue langue;
    private Systeme systeme;
    public void setLangue(Langue langue) {
        this.langue = langue;
    }
    public void setSysteme(Systeme systeme) {
        this.systeme = systeme;
    }
    public void affiche() {
        if (systeme != null) systeme.afficheConfiguration();
        if (langue != null) langue.afficheConfiguration();
    }
}
