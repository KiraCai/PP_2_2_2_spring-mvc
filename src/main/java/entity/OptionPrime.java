package entity;

public class OptionPrime implements Option {
    private boolean avecAbonnement;

    public void setAvecAbonnement(boolean avecAbonnement) {
        this.avecAbonnement = avecAbonnement;
    }

    @Override
    public String afficheConfiguration() {
        return "OptionPrime (avecAbonnement = " + avecAbonnement + ")";
    }
}
