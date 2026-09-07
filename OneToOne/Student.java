package com.venki.OneToOne;
import java.util.Objects;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int sid;
	@Column
	String sname;
	@Column
	int smarks;
	@Column
	int sage;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="aid",referencedColumnName="addrid")
	Address addr;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student( String sname, int smarks, int sage, Address addr) {
		super();
//		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
		this.sage = sage;
		this.addr = addr;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSmarks() {
		return smarks;
	}
	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public int hashCode() {
		return Objects.hash(addr, sage, sid, smarks, sname);
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
		return Objects.equals(addr, other.addr) && sage == other.sage && sid == other.sid && smarks == other.smarks
				&& Objects.equals(sname, other.sname);
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + ", sage=" + sage + ", addr=" + addr
				+ "]";
	}
}
 
