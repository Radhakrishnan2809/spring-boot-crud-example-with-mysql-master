package com.springbootcrudexample.service;

import com.springbootcrudexample.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentService {

	public Student save(Student student);
	public Student update(Student student);
	public Student get(Long id);
	public void delete(Long id);
	public List<Student> getAll();
}
