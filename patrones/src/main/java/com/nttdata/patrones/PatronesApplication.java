package com.nttdata.patrones;

import com.nttdata.patrones.model.Person;
import com.nttdata.patrones.model.User;
import com.nttdata.patrones.model.UserBuilder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class PatronesApplication implements CommandLineRunner {

	// JUAN LUIS LÓPEZ RODRÍGUEZ.


	Person juan = Person.getInstance("juan",32);



	public static void main(String[] args) {
		SpringApplication.run(PatronesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(juan.getName() +" "+juan.getAge());

		Person pepe = Person.getInstance("Pepe",20);

		System.out.println(pepe.getName() +" "+pepe.getAge());



	///  EJEMPLO 2 BUILDER.

	User usuario1 = new UserBuilder()
			.name("María")
			.surname("García")
			.age(20)
			.dni("123456789L").build();


		User usuario2 = new UserBuilder()
				.name("Pepe")
				.surname("Paz")
				.age(30)
				.dni("123456789H").build();

		System.out.println("*usuario 1*");
		System.out.println(usuario1);
		System.out.println("*usuario 2*");
		System.out.println(usuario2);


	}



}
