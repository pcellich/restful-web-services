package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);
	}

	/*
	RESTFUL WEB SERVICES

	Social Media Application

	Retrieve all Users					- GET	/users
	Create a User						- POST	/users
	Retrieve one User					- GET	/users/{id}/ -> /users/1
	Delete a User						- DELETE	/users/{id}/ -> /users/1
	Retrieve all posts for a user		- GET	/users/{id}/posts -> /users/1/posts
	Create a post for a user			- POST	/users/{id}/posts -> /users/1/posts
	Retrieve details of a post			- GET	/users/{id}/posts/{post_id} -> /users/1/posts

	 */
}
