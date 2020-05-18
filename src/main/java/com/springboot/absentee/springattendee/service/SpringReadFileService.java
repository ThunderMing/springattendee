package com.springboot.absentee.springattendee.service;


import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.springboot.absentee.springattendee.model.ContactsList;

public interface SpringReadFileService {

	List<ContactsList> findAll();

	boolean saveDataFromUploadfile(MultipartFile file);

}
