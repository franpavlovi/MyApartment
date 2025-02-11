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
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private float price;

    @NotNull
    private int numberOfNights;

    @NotNull
    private LocalDate startDate;

    @NotNull
    private LocalDate endDate;


}