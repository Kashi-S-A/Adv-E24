package com.tyss.counsellorapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.counsellorapp.dto.CounsellorDto;
import com.tyss.counsellorapp.service.CounsellorService;

@RestController
@RequestMapping("/cons")
public class CounsellorController {

	@Autowired
	private CounsellorService counsellorService;

	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody CounsellorDto counsellorDto) {
		return counsellorService.register(counsellorDto);
	}

}
