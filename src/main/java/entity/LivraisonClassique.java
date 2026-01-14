package entity;

public class LivraisonClassique implements Livraison {
    private int delaiMoyenJours;
    public void setDelaiMoyenJours(int delaiMoyenJours) {
        this.delaiMoyenJours = delaiMoyenJours;
    }
    @Override
    public String afficheConfiguration() {
        return "Livraison classique (délai moyen = " + delaiMoyenJours + " jours)";
    }
}