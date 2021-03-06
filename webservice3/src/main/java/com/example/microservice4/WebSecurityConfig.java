package com.example.microservice4;

import org.springframework.context.annotation.Bean;
import
org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
public class WebSecurityConfig {
@Bean
public UserDetailsService userDetailsService() throws Exception {
UserDetails user = 
User.withDefaultPasswordEncoder().username("user").password("password").roles("USE
R").build();
return new InMemoryUserDetailsManager(user);
}
}