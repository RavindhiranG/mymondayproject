package com.mymondayproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mymondayproject.dao.MyMondayProjectDao;
import com.mymondayproject.entity.Student;
import com.mymondayproject.exception.NoAgeException;

@Service
public class MyMondayProjectService {
	
	@Autowired
	MyMondayProjectDao md;
	
	public String postAll(List<Student> s) throws NoAgeException {
		
	    for (Student student : s) {
	        if (student.getAge() < 18) {
	            throw new NoAgeException("Student age must be greater than 18");
	        }
	    }
    
	    return md.postAll(s);
		 		
		
	}
	
	public List<Student> getAll() {
		return md.getAll();
	}

}
