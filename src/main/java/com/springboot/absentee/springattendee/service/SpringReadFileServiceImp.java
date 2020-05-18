package com.springboot.absentee.springattendee.service;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.absentee.springattendee.model.ContactsList;
import com.springboot.absentee.springattendee.repository.SpringReadFileRepository;
//import org.apache.commons.net.contactsList.setFileType


@Service
@Transactional
public class SpringReadFileServiceImp implements SpringReadFileService{

	@Autowired private SpringReadFileRepository springReadFileRepository;

	@Override
	public List<ContactsList> findAll() {
		
		return (List<ContactsList>) springReadFileRepository.findAll();
	}

	@Override
	public boolean saveDataFromUploadfile(MultipartFile file) {
		
		boolean isFlag = false;
		String extension = FilenameUtils.getExtension(file.getOriginalFilename());
		if(extension.equalsIgnoreCase("json")) {
			isFlag = readDataFromJson(file);
		}
			
			
		
		return false;
	}

	private boolean readDataFromJson(MultipartFile file) {
		try {
			InputStream inputStream = file.getInputStream();
			ObjectMapper mapper = new ObjectMapper();
			List<ContactsList> contactsLists = Arrays.asList(mapper.readValue(inputStream, ContactsList[].class));
			if(contactsLists != null && contactsLists.size()>0) {
				for(ContactsList contactsList : contactsLists) {
					contactsList.setFileType(FilenameUtils.getExtension(file.getOriginalFilename()));
					springReadFileRepository.save(contactsList);
				}
			}
			return true;	
		}catch (Exception e) {
			return false;
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
