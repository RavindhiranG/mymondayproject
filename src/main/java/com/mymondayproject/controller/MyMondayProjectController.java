package com.mymondayproject.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mymondayproject.MyMondayProjectApplication;
import com.mymondayproject.entity.Student;
import com.mymondayproject.exception.NoAgeException;
import com.mymondayproject.service.MyMondayProjectService;

@RestController

public class MyMondayProjectController {
	
	@Autowired
	MyMondayProjectService ms;
	
	
	Logger log = Logger.getLogger(MyMondayProjectController.class);
	
	@PostMapping(value = "/postAll")
	public String postAll(@RequestBody List<Student> s) throws NoAgeException {
		
		PropertyConfigurator.configure("my.properties");
		log.info(ms.postAll(s));
		
		return ms.postAll(s);
	}
	
	
	
	@GetMapping(value = "/getAll")
	public List<Student> getAll() {
		PropertyConfigurator.configure("my.properties");
		log.info(ms.getAll());
		return ms.getAll();
	}

}
