package com.venki.OneTpMany;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="course")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int cid;
	@Column(name="cname")
	String name;
	@ManyToOne
	@JoinColumn(name="sid")
	Student student;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int cid, String name, Student student) {
		super();
		this.cid = cid;
		this.name = name;
		this.student = student;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cid, name, student);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return cid == other.cid && Objects.equals(name, other.name) && Objects.equals(student, other.student);
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", name=" + name + ", student=" + student + "]";
	}
	public Course(String name, Student student) {
		super();
		this.name = name;
		this.student = student;
	}
	public Course(String name) {
		super();
		this.name = name;
	}
	
}


