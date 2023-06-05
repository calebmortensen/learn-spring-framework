package com.calebproject.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name, int age, Address address) {
	
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
	
    @Bean (name = "person1")
    @Primary
    public Person person() {
    	return new Person("John", 20, new Address("Main St", "Orlando"));
    	
    }
    
    @Bean (name = "person2")
    public Person person2() {
    	return new Person("John", 20, new Address("State St", "NY"));
    	
    }
    
    @Bean 
    public Person person5Qualifier(String name, int age,  @Qualifier("address3qualifier") Address address) {
    	return new Person(name, age, address);
    	
    }
    
    @Bean
    public Person person2MethodCall() {
    	return new Person(name(), age(), address());
    	
    }
    
    @Bean(name = "address2")
    @Primary
    public Address address() {
    	return new Address("1234 Harbor Dr", "San Diego");
    }
    
    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3() {
    	return new Address("5678 Main", "Ontario");
    }
	
}
