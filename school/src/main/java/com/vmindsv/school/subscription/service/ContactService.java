
package com.vmindsv.school.subscription.service;
import java.util.List;

import com.vmindsv.school.subscription.model.Customer;


import java.util.List;

import com.vmindsv.school.subscription.model.Contact;

public interface ContactService {
	List<Contact> getContact();

    boolean deleteContact(Long id);

    boolean saveContact(Contact contact);
    boolean putContact(Contact contact);
}




