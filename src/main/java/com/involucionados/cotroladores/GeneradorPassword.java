package com.involucionados.cotroladores;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeneradorPassword {

	public static void main(String... args) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
		
		System.out.println(bCryptPasswordEncoder.encode("123"));
	}
}