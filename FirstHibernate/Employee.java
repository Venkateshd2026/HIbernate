
package com.venki.Firsthibernate1;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_table")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;

    @Column
   String name;
    @Column
  String gender;
    @Column
     int salary;

    // Default constructor
    public Employee() {
        super();
    }

    // Constructor with id
    public Employee(int id, String name, String gender, int salary) {
        super();
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

    // Constructor without id
    public Employee(String name, String gender, int salary) {
        super();
        this.name = name;
        this.gender = gender;
        this.salary = salary;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, id, name, salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Employee other = (Employee) obj;

        return Objects.equals(gender, other.gender)
                && id == other.id
                && Objects.equals(name, other.name)
                && salary == other.salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id
                + ", name=" + name
                + ", gender=" + gender
                + ", salary=" + salary + "]";
    }
}

