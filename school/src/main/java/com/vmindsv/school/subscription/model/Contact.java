package com.vmindsv.school.subscription.model;

import java.util.List;

public class Contact {

    private Long id;
	private String firstName;
	private String lastName;
	private long dob;
	private String gender;
	private String email;
	private long phoneno;
	

    public Contact() {
      //  this(null, null, null,null,null,null,null);
    }
	
	
	public Contact(Long id, String firstName, String lastName,long dob,String gender,String email,long phoneno) {
        this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob=dob;
		this.gender=gender;
		this.email=email;
		this.phoneno=phoneno;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getDob() {
		return dob;
	}

	public void setDob(long dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	
}
      