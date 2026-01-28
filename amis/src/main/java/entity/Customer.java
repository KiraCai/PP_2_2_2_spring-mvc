package entity;

public class Customer {

    private int id;
    private String name;
    private String email;
    private String adresse;

    public Customer() {
    }

    public Customer(int id, String name, String email, String adresse) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.adresse = adresse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Customer{id=" + id + ", name='" + name + "', email='" + email + "', adresse='" + adresse + "'}";
    }
}