package com.mySpringBoot.projectOne.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Configuration
public class StudentConfig {



    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student alex = new Student(
                    1,
                    "Alex",
                    LocalDate.of(2000,10,10),
                    "alex@gmail.com",
                    23);
            Student merry = new Student(
                    2,
                    "Merry",
                    LocalDate.of(2000,10,10),
                    "merry@gmail.com",
                    23);

            repository.saveAll(List.of(alex,merry));
        };
    }
}
