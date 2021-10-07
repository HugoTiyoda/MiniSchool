package com.hugotiyoda.miniescola.entity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student hugo = new Student(
                    "hugo",
                    LocalDate.of(2002, Month.FEBRUARY, 8),
                    "hugotiyoda@gmail.com");

            Student ana = new Student(
                    "ana",
                    LocalDate.of(1996, Month.JUNE, 4),
                    "anaana@gmail.com");

            repository.saveAll(List.of(hugo, ana));

        };
    }
}

