package org.example.MODELS;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @Email
    private String email;

    @Pattern(regexp = "\\+?[0-9]{9,15}")
    private String phoneNumber;

    @NotNull
    private String password;

    @Transient
    private String repeatPassword;

    @AssertTrue
    public boolean passwordCheck() {

        try{
            return this.password.equals(this.repeatPassword);
        }catch (Exception e){
            return false;
        }
    }


    @OneToMany(mappedBy="user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reservation> rez = new ArrayList<>();

}