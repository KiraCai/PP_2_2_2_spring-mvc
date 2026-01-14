package entity;

public class OptionRetour implements Option {
    private int nbJoursRetour;

    public void setNbJoursRetour(int nbJoursRetour) {
        this.nbJoursRetour = nbJoursRetour;
    }

    @Override
    public String afficheConfiguration() {
        return "OptionRetour (retour possible pendant " + nbJoursRetour + " jours)";
    }
}
