package com.example.bussinesmanagmen.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import javax.print.attribute.standard.MediaSize;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Consumer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotNull
    private String name;
    @NotNull
    private String lastName;
    @NotNull
    private String Password;
    @NotNull
    private String dataTime;
    @NotNull
    private String phoneNumber;
    @NotNull
    private String email;
    @OneToMany(mappedBy = "consumer")
    @JsonManagedReference
    private List<Adress> consumerAdress;


}
