package com.nt.comps;

public class Student extends Person {

    private int studentId;
    private String course;

    public Student(String name, String address, NidDetails idDetails, int studentId, String course)
    {
        super(name, address, idDetails);
        this.studentId = studentId;

    }
}
