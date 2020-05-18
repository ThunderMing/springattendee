package com.springboot.absentee.springattendee.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.absentee.springattendee.model.ContactsList;

@Repository
public interface SpringReadFileRepository extends CrudRepository<ContactsList, String>{

}
