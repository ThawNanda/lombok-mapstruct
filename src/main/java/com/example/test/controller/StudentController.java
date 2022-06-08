package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.models.dtos.BookDto;
import com.example.test.models.dtos.StudentDto;
import com.example.test.models.entities.BookEntity;
import com.example.test.models.entities.StudentEntity;
import com.example.test.models.mapper.BookMapper;
import com.example.test.models.mapper.StudentMapper;
import com.example.test.models.response.StudentResponse;

@RestController
@RequestMapping("/student")
public class StudentController {

	private final StudentMapper studentMapper;
	private final BookMapper bookMapper;

	public StudentController(StudentMapper studentMapper, BookMapper bookMapper) {
		this.studentMapper = studentMapper;
		this.bookMapper = bookMapper;
	}

	@GetMapping
	public StudentEntity getStudent() {
		StudentDto studentDto = new StudentDto();
		studentDto.setId((long) 1);
		studentDto.setName("Ma Htaw");
		StudentEntity student = studentMapper.toEntity(studentDto);
		return student;
	}

	@GetMapping("/name")
	public StudentResponse getStu() {
		StudentDto studentDto = new StudentDto();
		studentDto.setId((long) 1);
		studentDto.setName("Ma Htaw");
		StudentResponse response = studentMapper.toResponse(studentDto);
		return response;
	}

	@GetMapping("/book")
	public BookEntity book() {
		BookDto bookDto = new BookDto();
		bookDto.setTitle("Book Ho");
		BookEntity book = bookMapper.toEntity(bookDto);
		return book;
	}
}
