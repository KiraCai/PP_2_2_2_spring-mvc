package entity;

public class Login {

    private int id;
    private String nom;
    private String password;

    public Login() {
    }

    public Login(int id, String nom, String password) {
        this.id = id;
        this.nom = nom;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{id=" + id + ", nom='" + nom + "', password='" + password + "'}";
    }
}