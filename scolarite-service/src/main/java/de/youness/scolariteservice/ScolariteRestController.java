package de.youness.scolariteservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@RestController
@RequestMapping("/api")
public class ScolariteRestController {
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/students")
	public List<Student> students(){
		return studentRepository.findAll();
	}

	@GetMapping("/students/{id}")
	public Student getOne(@PathVariable(name="id") Long id){
		return studentRepository.findById(id).get();
	}
	
	@PostMapping("/students")
	public Student save(@RequestBody Student student) {
		return studentRepository.save(student);
	}
	
	@PutMapping("/students/{id}")
	public Student update(@PathVariable(name="id") Long id, @RequestBody Student student){
		student.setId(id);
		return studentRepository.findById(id).get();
	}
}
