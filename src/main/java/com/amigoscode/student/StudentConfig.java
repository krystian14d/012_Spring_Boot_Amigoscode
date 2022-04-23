package com.amigoscode.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jan = new Student(
                    "Jan",
                    "jan.kowalski@gmail.com",
                    LocalDate.of(1999, 12, 01)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, 12, 01)
            );

            repository.saveAll(
                    List.of(jan, alex)
            );
        };
    }
}
