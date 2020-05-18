package com.springboot.absentee.springattendee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="contactsList")
public class ContactsList {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="trainee_id")
	private String traineeID;
	@Column(name="id")
	private Long id; 
	@Column(name="gender")
	private String gender;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="batch")
	private String batch;
	@Column(name="phone_number")
	private String phoneNumber;
	@Column(name="email")
	private String email;
	@Column(name="recruiter")
	private String recruiter;
	@Column(name="file_source")
	private String fileSource;
	
	@Transient
	private MultipartFile file;
	
	
	public ContactsList() {}
	
	public ContactsList(Long id, String traineeID, String gender, String firstName, String lastName, String batch,
			String phoneNumber, String email, String recruiter, String fileSource) {
		super();
		this.id = id;
		this.traineeID = traineeID;
		this.gender = gender;
		this.firstName = firstName;
		this.lastName = lastName;
		this.batch = batch;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.recruiter = recruiter;
		this.fileSource = fileSource;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTraineeID() {
		return traineeID;
	}
	public void setTraineeID(String traineeID) {
		this.traineeID = traineeID;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRecruiter() {
		return recruiter;
	}
	public void setRecruiter(String recruiter) {
		this.recruiter = recruiter;
	}
	public String getFileSource() {
		return fileSource;
	}
	public void setFileSource(String fileSource) {
		this.fileSource = fileSource;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
	
	
	
	

}
