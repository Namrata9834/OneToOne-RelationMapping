package com.springBootRelations.RelationMapping.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Laptop {
    @Id
    @GeneratedValue
    private int laptopId;
    private String modelNo;
    private String brand;

}

