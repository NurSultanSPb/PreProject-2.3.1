package example.models;


import javax.persistence.*;

@Entity
@Table(name = "people")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "hometown")
    private String city;

    @Column(name = "age")
    private int age;

    public User(String name, String surname, String city, int age) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;
    }

    public User() {}

    public User(int id, String name, String surname, String city, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age >= 0 && age < 150) {
            this.age = age;
        } else {
            this.age = -1;
        }
    }

}
