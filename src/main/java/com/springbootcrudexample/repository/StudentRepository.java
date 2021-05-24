package com.springbootcrudexample.repository;

import com.springbootcrudexample.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable> {

}
