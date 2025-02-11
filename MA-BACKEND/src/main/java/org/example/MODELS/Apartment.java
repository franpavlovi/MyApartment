package org.example.MODELS;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Apartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String name;

    @NotNull
    private String streetName;

    @NotNull
    private String city;

    @NotNull
    private String zipCode;


    @OneToMany(mappedBy="apartment", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reservation> rez = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="owner_id")
    private Owner owner;

    @OneToMany(mappedBy="apartment", cascade = CascadeType.ALL, orphanRemoval = true )
    private List<Availability> availability = new ArrayList<>();


}