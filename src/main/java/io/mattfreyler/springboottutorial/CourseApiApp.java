package io.mattfreyler.springboottutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args);
	}

}

/*
API's we'll be building:

GET      /topics       Gets all topics
GET      /topics/id    Gets the topic
POST     /topics       Create new topic
PUT      /topics/id    Updates the topic
DELETE   /topics/id    Deletes the topic
 */
