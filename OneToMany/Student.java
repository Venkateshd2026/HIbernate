package com.venki.OneTpMany;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@Column(name="sname")
	String name;
	@Column
	String email;
	@Column
	int pno;
	@OneToMany(mappedBy="student",cascade=CascadeType.ALL)
	List<Course>ref;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String email, int pno, List<Course> ref) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pno = pno;
		this.ref = ref;
	}
	public Student(String name, String email, int pno) {
		super();
		this.name = name;
		this.email = email;
		this.pno = pno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public List<Course> getRef() {
		return ref;
	}
	public void setRef(List<Course> ref) {
		this.ref = ref;
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, id, name, pno, ref);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name)
				&& pno == other.pno && Objects.equals(ref, other.ref);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", pno=" + pno + ", ref=" + ref + "]";
	}
	
	
}
