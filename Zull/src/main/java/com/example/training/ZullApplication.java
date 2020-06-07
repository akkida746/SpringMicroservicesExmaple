package com.example.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ZullApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZullApplication.class, args);
	}
	
	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	}

}
