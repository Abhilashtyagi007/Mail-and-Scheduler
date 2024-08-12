package com.email.dto;

import com.email.entities.Laptop;
import com.email.entities.Student;
import jakarta.persistence.OneToOne;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class StudentDto {

    private Student student;
    private List<Laptop> laptopList;
}
