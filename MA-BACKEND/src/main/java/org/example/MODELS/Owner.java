package org.example.MODELS;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @Email
    private String ownerEmail;

    @NotNull
    private String password;

    @Transient
    private String repeatPassword;

    public boolean passwordCheck(String password) {
        try{
            return this.password.equals(this.repeatPassword);
        } catch(Exception e) {
            return false;
        }
    }

}