package com.tyss.counsellorapp.dto;

import com.tyss.counsellorapp.enums.ClassMode;
import com.tyss.counsellorapp.enums.Course;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Filter {

	private ClassMode classMode;

	private Course course;
}
