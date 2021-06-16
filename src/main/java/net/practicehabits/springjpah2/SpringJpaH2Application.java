package net.practicehabits.springjpah2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaH2Application {
	
	private static final Logger log = LoggerFactory.getLogger(SpringJpaH2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaH2Application.class, args);
	}

}
