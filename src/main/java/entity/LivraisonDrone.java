package entity;

public class LivraisonDrone implements Livraison {

    private String typeLogement = "maison";

    @Override
    public String afficheConfiguration() {
        return "Livraison par drone (typeLogement = " + typeLogement + ")";
    }
}
