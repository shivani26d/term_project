package com.example.library.studentlibrary;

import com.example.library.studentlibrary.models.*;
import com.example.library.studentlibrary.repositories.CardRepository;
import com.example.library.studentlibrary.repositories.StudentRepository;
import com.example.library.studentlibrary.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StudentLibraryApplication implements CommandLineRunner {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	CardRepository cardRepository;





	public static void main(String[] args) {
		SpringApplication.run(StudentLibraryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		Student student = new Student("abc@gmail.com", "ABC", 40, "Slovakia");

		Card card = new Card();

		student.setCard(card);
		card.setStudent(student);

		cardRepository.save(card);


	}
}
