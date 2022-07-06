package com.srikanth.aws.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
@Profile("!local")
@Configuration
public class CloudSecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.inMemoryAuthentication()
			.withUser("Srikanth123")
			.password("{noop}****")
			.roles("ADMIN")
			.and()
			.withUser("Saikumar123")
			.password("{noop}****")
			.roles("USER");
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.ALWAYS)
			.and()
			.authorizeRequests().antMatchers("/login").permitAll()
			.and()
			.authorizeRequests().anyRequest().authenticated()
			.and()
			.formLogin()
			.defaultSuccessUrl("/api/message", true);
	}

}
