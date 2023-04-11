package com.nt.comps;

public class Employee extends Person
{
    private int empId;
    private String designation;

    public Employee(String name, String address, NidDetails idDetails, int empId, String designation) {
        super(name, address, idDetails);
        System.out.println("Employee :: 5 Params constructor");
        this.empId = empId;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", designation='" + designation + '\'' +
                '}'
                + super.toString()
                ;
    }
}
