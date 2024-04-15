package com.mymondayproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mymondayproject.entity.Student;

public interface MyMondayProjectRepository extends JpaRepository<Student, Integer> {

}
