package com.email.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int laptopId;
    private String brand;

    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;
}
