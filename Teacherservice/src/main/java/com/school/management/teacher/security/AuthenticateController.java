package com.school.management.teacher.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticateController {
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	MyUserDetailsService userDetailsService;
	
	@Autowired
	JwtUtil jwtUtil;

	@PostMapping("/authenticate")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception{
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
			
		} catch (BadCredentialsException e) {
			throw new Exception("Invalid username and password");
		}
	final UserDetails userDetails=	userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
	final String jwt=jwtUtil.generateToken(userDetails);
	
	return ResponseEntity.ok(new AuthenticationResponse(jwt));
	}
}
