package com.tyss.ca.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "contact_info")
@Getter
@Setter
@ToString
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cid;

	private String name;

	@Column(unique = true)
	private Long phone;

	@Column(nullable = false, unique = true)
	private Long adharNo;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@CreationTimestamp
	@Column(updatable = false)
	private LocalDateTime createdDate;

	@UpdateTimestamp
	private LocalDateTime udpatedDate;
}
