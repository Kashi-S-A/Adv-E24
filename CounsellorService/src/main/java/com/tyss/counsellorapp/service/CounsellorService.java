package com.tyss.counsellorapp.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tyss.counsellorapp.dto.CounsellorDto;
import com.tyss.counsellorapp.entity.Counsellor;
import com.tyss.counsellorapp.repository.CounsellorRepository;

@Service
public class CounsellorService {

	@Autowired
	private CounsellorRepository counsellorRepository;

	public ResponseEntity<String> register(CounsellorDto counsellorDto) {
		Optional<Counsellor> opt = counsellorRepository.findByEmail(counsellorDto.getEmail());

		if (opt.isPresent()) {
			// TODO: already registered
			return new ResponseEntity<String>(
					"Counsellor with email : " + counsellorDto.getEmail() + " is already registered", HttpStatus.OK);
		} else {
			// TODO: register

			Counsellor counsellor = new Counsellor();

			BeanUtils.copyProperties(counsellorDto, counsellor);

			counsellorRepository.save(counsellor);

			return new ResponseEntity<String>(
					"Counsellor with email : " + counsellorDto.getEmail() + " is registered successfully",
					HttpStatus.CREATED);
		}

	}
}
