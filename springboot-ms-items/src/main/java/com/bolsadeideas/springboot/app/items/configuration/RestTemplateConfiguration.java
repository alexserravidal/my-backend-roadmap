package com.bolsadeideas.springboot.app.items.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {
	
	@Bean
	public RestTemplate registerRestTemplate() {
		return new RestTemplate();
	}

}