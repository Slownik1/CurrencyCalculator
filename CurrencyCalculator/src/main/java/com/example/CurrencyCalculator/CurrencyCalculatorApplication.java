package com.example.CurrencyCalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CurrencyCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyCalculatorApplication.class, args);
	}

}
