package com.banana.university.entites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Foundation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;


    private String name;

    private String description;

    @ManyToOne
    @JoinColumn(name = "type_id", nullable = false)
    private FoundationType type; // Association to FoundationType


}
