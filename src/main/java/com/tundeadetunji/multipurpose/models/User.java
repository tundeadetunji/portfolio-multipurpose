package com.tundeadetunji.multipurpose.models;

import javax.persistence.*;

@Entity
@Table(name="Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true, length = 50, name = "Email")
    private String email;
    @Column(nullable = false, length = 15, name = "Password")
    private String password;
    @Column(nullable = false, unique = true, length = 50, name = "FirstName")
    private String firstName;
    @Column(nullable = false, unique = true, length = 50, name = "LastName")
    private String lastName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

















