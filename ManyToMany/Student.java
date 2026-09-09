package com.venki.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;
    String email;

    @ManyToMany
    @JoinTable(
        name = "student_club",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "club_id")
    )
    List<Club> clubs = new ArrayList<>();

    public Student() {
        super();
    }

    public Student(int id, String name, String email, List<Club> clubs) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.clubs = clubs;
    }

    public Student(String name, String email, List<Club> clubs) {
        super();
        this.name = name;
        this.email = email;
        this.clubs = clubs;
    }

    public Student(String name, String email) {
        super();
        this.name = name;
        this.email = email;
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

    public List<Club> getClubs() {
        return clubs;
    }

    public void setClubs(List<Club> clubs) {
        this.clubs = clubs;
    }

    public void addClub(Club club) {
        this.clubs.add(club);
        club.getStudents().add(this);
    }

    @Override
    public String toString() {
        return "Student [id=" + id +
                ", name=" + name +
                ", email=" + email + "]";
    }
}
