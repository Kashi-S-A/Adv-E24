package com.tyss.counsellorapp.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tyss.counsellorapp.dto.Filter;
import com.tyss.counsellorapp.entity.Counsellor;
import com.tyss.counsellorapp.entity.Enquiry;
import com.tyss.counsellorapp.enums.Status;
import com.tyss.counsellorapp.exception.CounsellorNotFoundException;
import com.tyss.counsellorapp.repository.CounsellorRepository;
import com.tyss.counsellorapp.repository.EnquiryRepository;

@Service
public class EnquiryService {

	@Autowired
	private EnquiryRepository enquiryRepository;

	@Autowired
	private CounsellorRepository counsellorRepository;

	public ResponseEntity<String> add(Integer cid, Enquiry enquiry) {
		Counsellor counsellor = counsellorRepository.findById(cid)
				.orElseThrow(() -> new CounsellorNotFoundException("counsellor is not registered"));

		if (counsellor.getStatus().equals(Status.ACTIVE)) {
			enquiry.setCounsellor(counsellor);
			enquiryRepository.save(enquiry);
			return new ResponseEntity<>("Enquiry is added Successfully", HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>("Inactive counsellor cannot add enquiry", HttpStatus.UNAUTHORIZED);
		}

	}

	public ResponseEntity<List<Enquiry>> getAll(Integer pageNumber) {
		List<Enquiry> list = enquiryRepository.findAll(PageRequest.of(pageNumber - 1, 2)).toList();// pageSize = 15
		return new ResponseEntity<List<Enquiry>>(list, HttpStatus.OK);
	}

	public ResponseEntity<List<Enquiry>> filter(Filter filter) {
		Enquiry enquiry = new Enquiry();
		BeanUtils.copyProperties(filter, enquiry);
		List<Enquiry> all = enquiryRepository.findAll(Example.of(enquiry));
		return new ResponseEntity<List<Enquiry>>(all, HttpStatus.OK);
	}
}
