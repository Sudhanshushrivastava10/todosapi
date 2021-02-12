package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorscConfig {
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			public void  addCorsMappings(CorsRegistry registry)
			{
				registry.addMapping("/**")
				.allowedMethods("GET","POST","PUT","DELETE")
				.allowedHeaders("*")
				.allowedOrigins("http://localhost:3000");
			}
		};
	}

}
