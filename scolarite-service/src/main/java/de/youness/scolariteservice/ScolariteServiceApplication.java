package de.youness.scolariteservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;


import java.util.Date;


@SpringBootApplication
public class ScolariteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScolariteServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(StudentRepository studentRepositoty, RepositoryRestConfiguration restConfiguration){
		return args -> {
			restConfiguration.exposeIdsFor(Student.class);
			//studentRepositoty.save(new Student(null, "Hassan", "Hassang@mail.com", new Date())) ;
			studentRepositoty.save(new Student(null,"Hassan","Hassang@mail.com", new Date()));
			studentRepositoty.save(new Student(null,"mohamed","mohamed@mail.com", new Date()));
			studentRepositoty.save(new Student(null,"Hasna","hasna@mail.com", new Date()));
			studentRepositoty.save(new Student(null,"Samira","samira@mail.com", new Date()));

			studentRepositoty.findAll().forEach(System.out::println);
		};
	}
}

/*
package de.youness.scolariteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScolariteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScolariteServiceApplication.class, args);
	}

}
*/