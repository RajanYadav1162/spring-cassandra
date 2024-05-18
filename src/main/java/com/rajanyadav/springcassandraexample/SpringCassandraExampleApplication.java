package com.rajanyadav.springcassandraexample;

import com.rajanyadav.springcassandraexample.model.Product;
import com.rajanyadav.springcassandraexample.repository.ProductRepository;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
@EnableCassandraRepositories(basePackages = "com.rajanyadav.springcassandraexample.*")
public class SpringCassandraExampleApplication {

	@Autowired
	ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringCassandraExampleApplication.class, args);
	}

	@Bean
	public CommandLineRunner startUp(){
		return (args)->{

			var products = productRepository.findAll();
			for(var p : products){
				System.out.println(p);
			}
			};
		};
	}


