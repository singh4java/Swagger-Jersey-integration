package com.apress.prospring3.ch8.dao;

import java.util.List;

import com.apress.prospring3.ch8.domain.Contact;

public interface ContactDao {
	public List<Contact> findAll();
	public List<Contact> findByFirstName(String firstName);
	public String findFirstNameById(Long id);
	public String findLastNameById(Long id);
	public List<Contact> findAllWithDetail();
	public void insert(Contact contact);
	public void insertWithDetail(Contact contact);
	public void update(Contact contact);
	public void delete(Long contactId);

}
