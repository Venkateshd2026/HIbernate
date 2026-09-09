package com.venki.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Club {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String club_name;

    @ManyToMany(mappedBy = "clubs")
    List<Student> students = new ArrayList<>();

    public Club() {
        super();
    }

    public Club(int id, String club_name, List<Student> students) {
        super();
        this.id = id;
        this.club_name = club_name;
        this.students = students;
    }

    public Club(String club_name, List<Student> students) {
        super();
        this.club_name = club_name;
        this.students = students;
    }

    public Club(String club_name) {
        super();
        this.club_name = club_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClub_name() {
        return club_name;
    }

    public void setClub_name(String club_name) {
        this.club_name = club_name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Club [id=" + id +
                ", club_name=" + club_name + "]";
    }
}
