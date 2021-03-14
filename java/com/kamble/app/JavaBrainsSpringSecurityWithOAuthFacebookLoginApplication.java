package com.kamble.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso	//When we want to use OAuth for Authentication (Tells Spring Security, we will be using something 
					//external For Logging in
public class JavaBrainsSpringSecurityWithOAuthFacebookLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBrainsSpringSecurityWithOAuthFacebookLoginApplication.class, args);
	}

}
