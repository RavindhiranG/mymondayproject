package com.mymondayproject;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyMondayProjectApplication {
	
	static Logger log = Logger.getLogger(MyMondayProjectApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MyMondayProjectApplication.class, args);
		PropertyConfigurator.configure("my.properties");
		log.info("Information");
		log.warn("Warning");
		log.error("Error");
		log.debug("Debugging");
		log.fatal("Fatal");
	}

}
