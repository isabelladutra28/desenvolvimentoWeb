package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.repository.OcorrenciaDAO;

@SpringBootApplication
@EntityScan(basePackages = "com.example.demo")
@ComponentScan(basePackages = {"com.*"})
@EnableJpaRepositories(basePackages = {"com.example.demo.repository"})
@EnableTransactionManagement
public class DemoApplication implements CommandLineRunner{
	
@Autowired
	private OcorrenciaDAO dao;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	
		
	}
public void run(String... args) throws Exception{
	
//	Ocorrencia oc = new Ocorrencia(1,"teste");
//	dao.save(oc);
	
	}
	

}
