package com.email.service;

import com.email.entities.Country;
import com.email.entities.Laptop;
import com.email.entities.Student;
import com.email.repositories.CountryRepo;
import com.email.repositories.LaptopRepo;
import com.email.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService{

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private LaptopRepo laptopRepo;

    @Autowired
    private CountryRepo country;


    @Transactional(propagation = Propagation.REQUIRES_NEW,readOnly = true)
    public String createStudent(Student student, List<Laptop> laptop) {
        studentRepo.save(student);
        if(student.getAge()==30)
            throw new IllegalArgumentException("H");
        for(Laptop l : laptop){
            l.setStudent(student);
            laptopRepo.save(l);
        }
        return "SUCCESS";
    }

    @Scheduled(fixedRate = 10000)
    public void schedulerTask(){
        List<Country> asia = country.findByStatus(9);
        for(Country c : asia){
            if( c.getStatus()==9){
                c.setStatus(10);
                country.save(c);
            }
        }


    }




}
