package com.airisdata.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airisdata.entity.Student;
import com.airisdata.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping("/{id}")
	public Student getStudent(@PathVariable(name = "id") Long id) {
		return studentService.getStudent(id);
	}

	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable(name = "id") Long id, @RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	@PostMapping
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}

	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable(name = "id") Long id) {
		studentService.deleteStudent(id);
	}
	
}
