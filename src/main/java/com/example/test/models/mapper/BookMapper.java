package com.example.test.models.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.example.test.models.dtos.BookDto;
import com.example.test.models.entities.BookEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface BookMapper {

	BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

	BookEntity toEntity(BookDto bookDto);

}
