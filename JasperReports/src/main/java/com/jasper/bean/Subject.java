package com.jasper.bean;

public class Subject {
	
	private String subjectName;
	
	private String teacherName;
	
	private Double score;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Subject(String subjectName, String teacherName, Double score) {
		super();
		this.subjectName = subjectName;
		this.teacherName = teacherName;
		this.score = score;
	}

	public Subject() {
		super();
	}
	
	

}
