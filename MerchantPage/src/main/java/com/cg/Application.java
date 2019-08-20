package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpringApplication.run(Application.class, args);
		}
		
		@Bean
		public CorsFilter corsFilter() {

		 UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

		 CorsConfiguration config = new CorsConfiguration();

		 config.setAllowCredentials(true);

		 config.addAllowedOrigin("*");

		 config.addAllowedHeader("*");

		 config.addAllowedMethod("OPTIONS");

		 config.addAllowedMethod("GET");

		 config.addAllowedMethod("POST");

		 config.addAllowedMethod("PUT");

		 config.addAllowedMethod("DELETE");

		 source.registerCorsConfiguration("/**", config);

		 return new CorsFilter(source);

	}

}
