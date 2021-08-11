package com.example.rcp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value= {"com.example.rcp.mapper"})

public class ReceptionProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReceptionProjectApplication.class, args);
	}

}
