package com.calebproject.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name, int age) {
	
};

record Address(String streetAddress, String city) {
	
}


@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Caleb";
	}
	
	@Bean
	public int age() {
		return 44;
	}
	
    @Bean
    public Person person() {
    	return new Person("John", 20);
    	
    }
    
    @Bean
    public Address address() {
    	return new Address("1234 Harbor Dr", "San Diego");
    }
	
}
