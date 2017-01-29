package com.vmindsv.school.subscription.entity;

import javax.persistence.*;

@Entity
@Table(name = "Contact")
public class ContactEntity implements Cloneable {
	
	private Long id;
	private String firstName;
	private String lastName;
	private long dob;
	private String gender;
	private String email;
	private long phoneno;
	
	
	public ContactEntity() {
		//this(null, null, null,null,null,null,null);
	}
	
	public ContactEntity(Long id, String firstName, String lastName,long dob,String gender,String email,long phoneno) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob=dob;
		this.gender=gender;
		this.email=email;
		this.phoneno=phoneno;
	}
	
	
	@Id
	@Column(name = "contact_id",nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "first_name", nullable = false)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
	
	// ====== Cloneable Override =========
    @Column(name = "dob", nullable = false)
    public long getDob() {
		return dob;
	}

	public void setDob(long dob) {
		this.dob = dob;
	}
	@Column(name = "gender", nullable = false)
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	@Column(name = "email", nullable = false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Column(name = "phoneno", nullable = false)
	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public ContactEntity clone() {
		return new ContactEntity(id, firstName, lastName,dob,gender,email,phoneno);
	}


    @Override
    public String toString() {
        return "ContactEntity{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", phoneno='" + phoneno + '\'' +
                '}';
    }

	
}
