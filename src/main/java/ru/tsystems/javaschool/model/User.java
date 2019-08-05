package ru.tsystems.javaschool.model;

import ru.tsystems.javaschool.types.AuthorityType;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Min(3)
    @Valid
    private String username;

    @Min(5)
    @NotNull
    @NotEmpty
    private String password;


    @Enumerated(EnumType.STRING)
    @Column (name = "role")
    private AuthorityType role;


    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AuthorityType getRole() {
        return role;
    }

    public void setRole(AuthorityType role) {
        this.role = role;
    }
}
