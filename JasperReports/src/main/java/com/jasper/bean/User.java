package com.jasper.bean;

public class User {
	
	private Integer id;
	
	private String userName;
	
	private Integer age;
	//部门ID
	private Integer deptId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public User(Integer id, String userName, Integer age, Integer deptId) {
		super();
		this.id = id;
		this.userName = userName;
		this.age = age;
		this.deptId = deptId;
	}
	public User() {
		super();
	}
	
	

}
