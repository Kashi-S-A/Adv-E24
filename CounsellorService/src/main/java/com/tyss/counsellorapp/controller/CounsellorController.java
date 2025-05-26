package com.tyss.counsellorapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.counsellorapp.dto.CounsellorDto;
import com.tyss.counsellorapp.dto.LoginDTO;
import com.tyss.counsellorapp.entity.Counsellor;
import com.tyss.counsellorapp.enums.Status;
import com.tyss.counsellorapp.service.CounsellorService;

@RestController
@RequestMapping("/cons")
@CrossOrigin("http://localhost:4000")//url of react app
public class CounsellorController {

	@Autowired
	private CounsellorService counsellorService;

	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody CounsellorDto counsellorDto) {
		return counsellorService.register(counsellorDto);
	}

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody LoginDTO dto) {
		return counsellorService.login(dto);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateStatus(@PathVariable Integer id, @RequestParam Status status) {
		return counsellorService.updateStatus(id, status);
	}

	@GetMapping("/profile/{id}")
	public ResponseEntity<Counsellor> getProfile(@PathVariable Integer id) {
		return counsellorService.getProfile(id);
	}

//	delete counsellor account
//	@DeleteMapping("/delete/{id}")
//	public ResponseEntity<String> deleteProfile(@PathVariable Integer id) {
//		return counsellorService.deleteProfile(id);
//	}

	// get all the enquiries by cid, use pagination
//	@GetMapping("/enqs/{id}")
//	public ResponseEntity<List<Enquiry>> getEnqByCid(@PathVariable Integer id) {
//		return counsellorService.getEnqByCid(id);
//	}

	
}
