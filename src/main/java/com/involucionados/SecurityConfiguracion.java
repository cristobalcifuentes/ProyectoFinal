package com.involucionados;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.firewall.HttpFirewall;
import org.springframework.security.web.firewall.StrictHttpFirewall;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.involucionados.servicio.implementaciones.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class SecurityConfiguracion extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	
	String resources[] = new String[] {
			"/include/**","/css/**","/icons/**","/images/**","/js/**"
	};
	
	@Bean 
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bcrypPasswordEncoder = new BCryptPasswordEncoder();
		return bcrypPasswordEncoder;
	}
	
	@Bean
    public HttpFirewall looseHttpFirewall() {
        StrictHttpFirewall firewall = new StrictHttpFirewall();
        firewall.setAllowedHttpMethods(Arrays.asList("GET", "POST"));
        firewall.setAllowSemicolon(true);
        firewall.setAllowUrlEncodedSlash(false);
        firewall.setAllowBackSlash(false);
        firewall.setAllowUrlEncodedPercent(true);
        firewall.setAllowUrlEncodedPeriod(true);
        return firewall;
    }

	

	@Override
	public void configure(WebSecurity web) throws Exception {
		super.configure(web.httpFirewall(looseHttpFirewall()));
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}
	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.csrf().disable()
		.authorizeRequests()
		.antMatchers(resources).permitAll()
		.antMatchers("Admin/**").hasRole("administrador")
		.antMatchers("Cliente/**").hasRole("cliente")
		.antMatchers("Profesional/**").hasRole("profesional")
			.anyRequest().authenticated()
			.and()
		.formLogin()
			.loginPage("/login")
			.permitAll()
			.defaultSuccessUrl("/")
			.usernameParameter("usuario")
			.passwordParameter("contrasena")
			.and()
		.logout()
			.permitAll()
			.logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login?logout");
	}
	
}
