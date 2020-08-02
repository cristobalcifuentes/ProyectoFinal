package com.involucionados.servicio.implementaciones;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.involucionados.modelo.entidades.Usuario;
import com.involucionados.modelo.repositorios.UsuarioRepo;

@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	UsuarioRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		/** 
		 * Se obtiene el usuario a travez de nombre de usuario
		 * */
		Usuario us = repo.findByLogin(username);
		
		/** 
		 * Se crea una lista de roles para entregarsela a Security
		 * */
		List<GrantedAuthority> roles = new ArrayList<>();
			roles.add(new SimpleGrantedAuthority(us.getRol().getRol()));
			
			/** 
			 * Se crea el objeto a retornar con sus credenciales
			 * */
			UserDetails userDet = new User(us.getLogin(),us.getPassword(),roles);
		
			/** 
			 * Se retorna el objeto del tipo UserDetails
			 * */
		return userDet;
		
	}
	

}
