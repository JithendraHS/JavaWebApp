package com.JavaWebApplication.Beans;

public class RegisterBean {
	private String name;
	private String email;
	private String password;
	private String fathername;
	private String semester;
	private String cgpa;
	private String branch;
	private String mobilenumber;
	private String usn;
	private String srno;
	private String notification;
	private String type;
	private String comments;
	
	
	public RegisterBean() {
		super();
	}
	public RegisterBean(String name, String email, String password, String fatherName, String branch, String semester, String cgpa, String mobileNumber,String usn, String srno,String notification,String type,String comments) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.fathername = fatherName;
		this.branch =semester;
		this.cgpa= cgpa;
		this.mobilenumber = mobileNumber;
		this.usn=usn;
		this.srno=srno;
		this.notification=notification;
		this.type=type;
		this.comments=comments;
	}
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public String getSrno() {
		return srno;
	}
	public void setSrno(String srno) {
		this.srno = srno;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getCgpa() {
		return cgpa;
	}
	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNotification() {
		return notification;
	}
	public void setNotification(String notification) {
		this.notification = notification;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
