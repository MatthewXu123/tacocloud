
package com.matthewxu.tacocloud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Description:
 * @author Matthew Xu
 * @date Jun 15, 2021
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.inMemoryAuthentication()
			.passwordEncoder(new MyPasswordEncoder())
				.withUser("user1")
					.password("Xuzhiyuan0077777")
					.authorities("ROLE_USER")
				.and()
					.withUser("user2")
						.password("pwd2")
						.authorities("ROLE_USER");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
				.antMatchers("/design", "/orders")
					.access("hasRole('ROLE_USER')")
				.antMatchers("/", "/**")
					.permitAll()
			.and()
				.formLogin()
				.loginPage("/login")
				.defaultSuccessUrl("/design", true)
			.and()
				.logout()
				.logoutSuccessUrl("/");
				
		
	}
	
}
