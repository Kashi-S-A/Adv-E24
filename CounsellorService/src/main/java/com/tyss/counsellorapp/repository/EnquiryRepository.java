package com.tyss.counsellorapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.counsellorapp.entity.Enquiry;

public interface EnquiryRepository extends JpaRepository<Enquiry, Integer>{

}
