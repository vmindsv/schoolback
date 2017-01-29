package com.vmindsv.school.subscription.dao;

import com.vmindsv.school.subscription.model.Contact;

import java.util.List;

public interface ContactDao {
    List<Contact> getContacts();

    boolean deleteContact(Long id);

    boolean saveContact(Contact contact);
    boolean putContact(Contact contact);
    
}
