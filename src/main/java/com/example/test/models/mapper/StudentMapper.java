package com.example.test.models.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.test.models.dtos.StudentDto;
import com.example.test.models.entities.StudentEntity;
import com.example.test.models.response.StudentResponse;

@Mapper(componentModel = "spring")
public interface StudentMapper {

	StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

	StudentEntity toEntity(StudentDto studentDto);

	StudentResponse toResponse(StudentDto studentDto);

}
