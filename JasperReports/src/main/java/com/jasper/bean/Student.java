package com.jasper.bean;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private Integer stuNo;
	
	private String stuName;
	
	private List<Subject> subjectList = new ArrayList<Subject>();

	public Integer getStuNo() {
		return stuNo;
	}

	public void setStuNo(Integer stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public List<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	
	
	

}
