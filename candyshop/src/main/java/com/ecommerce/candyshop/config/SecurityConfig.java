package com.ecommerce.candyshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsAuthentication()
    {
        UserDetails user = User.withDefaultPasswordEncoder().username("manju").password("manju@123").roles("User").build();

        return new InMemoryUserDetailsManager(user);
    }
}
