package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String adresse;

    // Конструктор пустой (обязателен для JPA)
    public Customer() {
    }

    // Конструктор с 2 аргументами
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Конструктор с 3 аргументами
    public Customer(String name, String email, String adresse) {
        this.name = name;
        this.email = email;
        this.adresse = adresse;
    }

    // Getters и Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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