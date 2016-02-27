package com.siiie.Family;


public class Child extends Person{

    private Man father;
    private Woman mother;


    @Override
    String FamilyRole() {
        return "Child";
    }
}
