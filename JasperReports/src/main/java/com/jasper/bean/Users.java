package com.jasper.bean;

public class Users {
	
	private Integer userId;
	private String userName;
	private String grade;
	private String college;
	private String mobile;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Users(Integer userId, String userName, String grade, String college, String mobile) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.grade = grade;
		this.college = college;
		this.mobile = mobile;
	}
	public Users() {
		super();
	}
	
	

}
