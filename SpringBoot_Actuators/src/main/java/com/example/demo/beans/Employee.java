package com.example.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
    private int eid;
    private String ename;
    private String eadress;
	public int getEid() {
		return eid;
	}
	
	public Employee(int eid, String ename, String eadress) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eadress = eadress;
	}
	

	public Employee() {
		super();
	}

	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEadress() {
		return eadress;
	}
	public void setEadress(String eadress) {
		this.eadress = eadress;
	}
    
    
	

}
