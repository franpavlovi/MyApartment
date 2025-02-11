package org.example.MODELS;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Availability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private LocalDate  startDate;

    @NotNull
    private LocalDate endDate;


    @ManyToOne
    @JoinColumn(name = "apartment_id")
    private Apartment apartment;

}