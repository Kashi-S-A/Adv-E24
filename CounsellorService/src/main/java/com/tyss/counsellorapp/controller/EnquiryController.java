package com.tyss.counsellorapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.counsellorapp.dto.Filter;
import com.tyss.counsellorapp.entity.Enquiry;
import com.tyss.counsellorapp.service.EnquiryService;

@RestController
@RequestMapping("/enq")
@CrossOrigin("http://localhost:4000")//url of react app
public class EnquiryController {

	@Autowired
	private EnquiryService enquiryService;

	// adding enquiry
	@PostMapping("/add/{cid}")
	public ResponseEntity<String> addEn(@PathVariable Integer cid, @RequestBody Enquiry enquiry) {
		return enquiryService.add(cid, enquiry);
	}

	// updating enq Class Mode
//	@PutMapping("/update/{eid}")
//	public String updateClassMode(@PathVariable Integer eid, @RequestParam ClassMode classMode) {
//		return enquiryService.updateClassMode(eid,classMode);
//	}

	// update enq Course
//	@PutMapping("/update/{eid}")
//	public String updateCourse(@PathVariable Integer eid, @RequestParam Course course) {
//		return enquiryService.updateCourse(eid,course);
//	}

	// delete enq
//	@DeleteMapping("/delete/{eid}")
//	public ResponseEntity<String> deleteEnq(@PathVariable Integer eid) {
//		return enquiryService.deleteEnq(eid);
//	}

	// get all(pagination)
	@GetMapping("/enqs/{pageNumber}")
	public ResponseEntity<List<Enquiry>> getAll(@PathVariable Integer pageNumber) {
		return enquiryService.getAll(pageNumber);
	}

	// filter enq based on Course , Class Mode
	@GetMapping("/filter")
	public ResponseEntity<List<Enquiry>> filter(@RequestBody Filter filter) {
		return enquiryService.filter(filter);
	}
	
}
