package com.example.practice1.mailSenderService.model;

public class AddEmployee 
{
	private int eid;
	private String ename;
	public int getEid() {
		return eid;
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
	@Override //Converting object into String using toString method
	public String toString() {
		return "AddEmployee [eid=" + eid + ", ename=" + ename + "]";
	}
	//Also we created a constructor to avoide getter/setter
	public AddEmployee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}	
}
