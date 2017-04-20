package com.anjalil.admin.family.person;

/**
 * Created by admin on 4/20/2017.
 */

public class Person {
    private String name = "";
    private int year_of_birth;
    private String gender;
    Person wife;

    public Person(String name,int yob,String gender){
        this.gender = gender;
        this.name = name;
        this.year_of_birth = yob;

    }
    public Person(String name,int yob,String gender,Person wife){
        this.gender = gender;
        this.name = name;
        this.year_of_birth = yob;
        this.wife = wife;
    }
    public String getName(){
        return this.name;
    }

    public int getYear_of_birth(){
        return this.year_of_birth;
    }
    public String getGender()
    {
        return this.gender;
    }
    public String getWifeName(){
        return this.wife.name;
    }
}