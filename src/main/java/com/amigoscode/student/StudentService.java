package com.amigoscode.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(
                        1L,
                        "Jan",
                        "jan.kowalski@gmail.com",
                        LocalDate.of(1999, 12, 01),
                        21
                )
        );
    }
}
