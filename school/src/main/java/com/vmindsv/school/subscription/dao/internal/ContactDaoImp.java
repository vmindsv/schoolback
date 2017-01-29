package com.vmindsv.school.subscription.dao.internal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vmindsv.school.subscription.dao.ContactDao;
import com.vmindsv.school.subscription.dao.CustomerDao;
import com.vmindsv.school.subscription.entity.ContactEntity;
import com.vmindsv.school.subscription.entity.CustomerEntity;
import com.vmindsv.school.subscription.exception.UpdateDeleteException;
import com.vmindsv.school.subscription.model.Contact;
import com.vmindsv.school.subscription.model.Customer;
import com.vmindsv.school.subscription.persistance.base.BaseDao;
import com.vmindsv.school.subscription.query.SelectContact;
import com.vmindsv.school.subscription.query.SelectCustomer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Repository
public class ContactDaoImp extends BaseDao implements ContactDao {

    private static Logger log = LoggerFactory.getLogger(ContactDaoImp.class);

    @Transactional(readOnly = true)
    @Override
    public List<Contact> getContacts() {
        List<Contact> contacts = new ArrayList<Contact>();

        Collection<ContactEntity> contactEntities = loadData(ContactEntity.class, new SelectContact());

        if (contactEntities == null || contactEntities.isEmpty()) {
            log.info("No contacts found");
        }
        else
        {
            for(ContactEntity contactEntity : contactEntities) {
                contacts.add(toContact(contactEntity));
            }
        }

        return contacts;
    }
   

    @Transactional
    @Override
    public boolean deleteContact(Long id) {
        boolean success = false;

        try {
            success = deleteSingleData(ContactEntity.class, id);
        }
        catch(UpdateDeleteException e) {
            log.error("Error deleting customer with id: " + id);
        }

        return success;
    }

    @Transactional
    @Override
    public boolean saveContact(Contact contact) {
        boolean success = false;

        try {
            success = updateSingleData(toContactEntity(contact));
        }
        catch(UpdateDeleteException e) {
            log.error("Error saving contact with id: " + contact.getId());
        }

        return success;
    }
    @Override
	public boolean putContact(Contact contact) {
    	boolean success = false;

        try {
            success = updateSingleData(toContactEntity(contact));
        }
        catch(UpdateDeleteException e) {
            log.error("Error modifying contact with id: " + contact.getId());
        }
		return success;
	}
   

    // ======== Helpers =========

    private Contact toContact(ContactEntity contactEntity) {
        Contact contact = null;

        if(contactEntity != null) {
            contact = new Contact(contactEntity.getId(), contactEntity.getFirstName(), contactEntity.getLastName(),contactEntity.getDob(),contactEntity.getEmail(),contactEntity.getGender(),contactEntity.getPhoneno());
        }

        return contact;
    }

    private ContactEntity toContactEntity(Contact contact) {
        ContactEntity entity = null;

        if(contact != null) {
            entity = new ContactEntity(contact.getId(), contact.getFirstName(), contact.getLastName(),contact.getDob(),contact.getGender(),
            		contact.getEmail(),contact.getPhoneno());
        }

        return entity;
    }

	

	

	
}
