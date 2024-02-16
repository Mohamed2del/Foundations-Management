package com.banana.university.entites.users;

import com.banana.university.entites.Foundation;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class BusinessUser extends User {

    @Column(nullable = false, length = 100)
    private String department;

    @Column(name = "employee_id", nullable = false, unique = true, length = 50)
    private String employeeId;

    @Column(name = "office_location", length = 100)
    private String officeLocation;

    // Relationship with Foundation
    @ManyToOne
    @JoinColumn(name = "foundation_id", nullable = false)
    private Foundation foundation;
}
