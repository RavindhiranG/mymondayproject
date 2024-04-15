package com.mymondayproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mymondayproject.entity.Student;
import com.mymondayproject.repository.MyMondayProjectRepository;

@Repository
public class MyMondayProjectDao {
	
	@Autowired
	MyMondayProjectRepository mr;
	
	public String postAll(List<Student> s) {
		mr.saveAll(s);
		return "saved all";
	}
	
	public List<Student> getAll() {
		return mr.findAll();
	}

}
