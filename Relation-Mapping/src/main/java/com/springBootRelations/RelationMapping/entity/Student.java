package com.springBootRelations.RelationMapping.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String studentName;
    private String about;

    @OneToOne
    @JoinColumn(name = "student-id")
    private Laptop laptop;
}
