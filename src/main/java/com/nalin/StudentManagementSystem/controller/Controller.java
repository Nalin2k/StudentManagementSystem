package com.nalin.StudentManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nalin.StudentManagementSystem.entity.Student;
import com.nalin.StudentManagementSystem.service.StudentService;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired 
	private StudentService service;
	
	@GetMapping("/home")
	public String home() {
		return "home"; 
	}
	
	@GetMapping("/students")
	public String getAllStudents(Model model) {
		model.addAttribute("students", service.getAllStudents());
		return "students";
	}
	
	@GetMapping("/new")
	public String createStudent(Model model) {
		Student student = new Student();
		model.addAttribute("students", student);
		return "create-student";
	}
}
