package com.tyss.counsellorapp.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tyss.counsellorapp.dto.CounsellorDto;
import com.tyss.counsellorapp.dto.LoginDTO;
import com.tyss.counsellorapp.entity.Counsellor;
import com.tyss.counsellorapp.enums.Status;
import com.tyss.counsellorapp.exception.CounsellorNotFoundException;
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

	public ResponseEntity<String> login(LoginDTO dto) {
		Counsellor counsellor = counsellorRepository.findByEmail(dto.getEmail())
				.orElseThrow(() -> new CounsellorNotFoundException("counsellor is not registered"));

		if (counsellor.getPassword().equals(dto.getPassword())) {
			// TODO : return login succ
			return new ResponseEntity<>("Logged in Successfully", HttpStatus.OK);
		} else {
			// TODO : Invalid password
			return new ResponseEntity<>("Invalid password", HttpStatus.BAD_REQUEST);
		}

	}

	public ResponseEntity<String> updateStatus(Integer id, Status status) {
		Counsellor counsellor = counsellorRepository.findById(id)
				.orElseThrow(() -> new CounsellorNotFoundException("Counsellor is not found"));
		counsellor.setStatus(status);
		counsellorRepository.save(counsellor);
		return new ResponseEntity<String>("status updated to : " + counsellor.getStatus(), HttpStatus.OK);
	}

	public ResponseEntity<Counsellor> getProfile(Integer id) {
		Counsellor counsellor = counsellorRepository.findById(id)
				.orElseThrow(() -> new CounsellorNotFoundException("Counsellor is not found"));
		return new ResponseEntity<>(counsellor, HttpStatus.OK);
	}
}
