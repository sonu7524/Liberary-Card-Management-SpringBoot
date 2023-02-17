package com.college.liberaryCard.Repository;


import com.college.liberaryCard.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepository extends JpaRepository<Student,Integer> {


}
