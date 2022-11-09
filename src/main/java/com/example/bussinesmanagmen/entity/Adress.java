package com.example.bussinesmanagmen.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "country_id",
            insertable = false,
            updatable = false)
    private Country country;
    private long country_id;
    @NotNull
    private String streetName;
    @NotNull
    private String neighbourhoodName;
    @NotNull
    private String homeNumber;
    @NotNull
    private String cityName;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "user_id")
    private UserModel userModel;


}
