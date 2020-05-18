package com.springboot.absentee.springattendee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springboot.absentee.springattendee.model.ContactsList;
import com.springboot.absentee.springattendee.service.SpringReadFileService;

@Controller
public class SpringReadFileController {
	
	@Autowired private SpringReadFileService springReadFileService;
	
	@GetMapping(value="/")
	public String home(Model model) {
		model.addAttribute("contactsList", new ContactsList());
		List<ContactsList> contactsLists = springReadFileService.findAll();
		model.addAttribute("contactsLists", contactsLists);
		
		
		return "view/contactsLists";
	}
	
	@PostMapping(value="/fileupload")
	public String uploadFile(@ModelAttribute ContactsList contactsList, RedirectAttributes redirectAttributes) {
		
		boolean isFlag = springReadFileService.saveDataFromUploadfile(contactsList.getFile());
		
		return "redirect:/";
	}

}
