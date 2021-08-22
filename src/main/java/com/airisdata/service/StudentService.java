package com.airisdata.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.airisdata.entity.Student;
import com.airisdata.repository.StudentRepository;

@Service
public class StudentService {
	private StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public Student getStudent(Long id) {
		Optional<Student> findById = studentRepository.findById(id);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}
	
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
	}
	
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
}
