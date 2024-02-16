package com.banana.university.entites.users;

import com.banana.university.entites.Foundation;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Client extends User {

    @Column(name = "client_id", nullable = false, unique = true, length = 50)
    private String clientId;


    @Temporal(TemporalType.DATE)
    @Column(name = "association_date", nullable = false)
    private Date associationDate;

    // Relationship with Foundation
    @ManyToOne
    @JoinColumn(name = "foundation_id", nullable = false)
    private Foundation foundation;
}
