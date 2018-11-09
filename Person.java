package com.ahmad.Lab_07;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {
	@Id
	private int id;
	private String name;
	private String father_name;
	private String organization;
	private String mobile_no;
	
	public Person() {}
	
	public Person(int id, String name, String father_name, String organization, String mobile_no) {
		setId(id);
		setName(name);
		setFathername(father_name);
		setOrganization(organization);
		setMobile(mobile_no);
	}
	
	//getters setters
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getFathername() {
		return father_name;
	}
	
	public String getOrganization() {
		return organization;
	}
	
	public String getMobile() {
		return mobile_no;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setFathername(String fathername) {
		this.father_name = fathername;
	}
	
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	
	public void setMobile(String mobile) {
		this.mobile_no = mobile;
	}
}
