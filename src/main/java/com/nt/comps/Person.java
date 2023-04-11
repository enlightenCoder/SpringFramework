package com.nt.comps;

// Target class
public abstract class Person {

    private String name;
    private String address;
    private NidDetails idDetails;

    public Person(String name, String address, NidDetails idDetails) {
        System.out.println("Person :: 3 Param constructor");
        this.name = name;
        this.address = address;
        this.idDetails = idDetails;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", idDetails=" + idDetails +
                '}';
    }
}
