
package com.vmindsv.school.subscription.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vmindsv.school.subscription.model.Contact;
import com.vmindsv.school.subscription.model.Customer;
import com.vmindsv.school.subscription.service.ContactService;
import com.vmindsv.school.subscription.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping(value = "/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

  
    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Contact> getContacts() {
        return contactService.getContact();
    }

    @RequestMapping(path="/findcontact",method = RequestMethod.GET, produces = "application/json")
    public List<Contact>findcustomers(@RequestParam String firstName){
        return contactService.getContact();
    }

    
    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public boolean saveContact(@RequestBody Contact contact) {
        return contactService.saveContact(contact);
    }

  
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public boolean deleteContact(@PathVariable Long id) {
        return contactService.deleteContact(id);
    }
    @RequestMapping(method = RequestMethod.PUT, produces = "application/json")
    public boolean putContact(@RequestBody Contact contact) {
        return contactService.putContact(contact);
    }
    
}
