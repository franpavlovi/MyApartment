package org.example.MODELS;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;


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
    private String startDate;

    @NotNull
    private String endDate;


}