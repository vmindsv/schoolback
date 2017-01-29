package com.vmindsv.school.subscription.service.internal;

import com.vmindsv.school.subscription.model.Contact;
import com.vmindsv.school.subscription.model.Customer;
import com.vmindsv.school.subscription.service.ContactService;
import com.vmindsv.school.subscription.service.CustomerService;
import com.vmindsv.school.subscription.dao.ContactDao;
import com.vmindsv.school.subscription.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "ContactService")
public class ContactServiceImp implements ContactService {

    @Autowired
    private ContactDao contactDao;

	@Override
	public List<Contact> getContact() {
		return contactDao.getContacts();
	}

    @Override
    public boolean deleteContact(Long id) {
        return contactDao.deleteContact(id);
    }
    @Override
	public boolean putContact(Contact contact) {
		return contactDao.putContact(contact);
	}

    @Override
    public boolean saveContact(Contact contact) { return contactDao.saveContact(contact); }

	
}
