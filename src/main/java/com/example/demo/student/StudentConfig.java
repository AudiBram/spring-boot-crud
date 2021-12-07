package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.AUGUST;
import static java.time.Month.DECEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {

            Student dono = new Student(
                    "Dono",
                    "donokasinoindro@gmail.com",
                    LocalDate.of(2000, DECEMBER, 5)

            );

            Student agus = new Student(
                    "Agus",
                    "agusganteng@gmail.com",
                    LocalDate.of(1987, AUGUST, 30)

            );
            studentRepository.saveAll(
                    List.of(dono, agus)
            );
        };
    }
}
