package com.mangafy.api.infra.configuration;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
		return httpSecurity.cors(cors -> cors.configurationSource(request -> {
			var corsConfiguration = new org.springframework.web.cors.CorsConfiguration();
			corsConfiguration.setAllowedOrigins(Collections.singletonList("*"));
			corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "PATCH"));
			corsConfiguration.setAllowedHeaders(Arrays.asList("*"));
			return corsConfiguration;
		})).csrf(csrf -> csrf.disable())
				.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.authorizeHttpRequests(authorize -> authorize
						.anyRequest().permitAll())
				.build();
	}
}
