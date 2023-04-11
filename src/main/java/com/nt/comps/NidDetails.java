package com.nt.comps;


// National Identification Details
//Dependent class
public class NidDetails
{

    private long id;
    private int age;
    private long mobileNo;

    public NidDetails(long id, int age, long mobileNo) {
        System.out.println("NidDetails Parameterized Constructor");
        this.id = id;
        this.age = age;
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "NidDetails{" +
                "id=" + id +
                ", age=" + age +
                ", mobileNo=" + mobileNo +
                '}';
    }
}
