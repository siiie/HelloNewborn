package com.siiie.Family;


public class Child extends Person{

    private Man father;
    private Woman mother;


    @Override
    public String FamilyRole() {
        return GetfName() + " is " + "Their Child";
    }

    public Man GetFather() {
        return father;
    }

    public void SetFather(Man father) {
        this.father = father;
    }

    public Woman GetMother() {
        return mother;
    }

    public void SetMother(Woman mother) {
        this.mother = mother;
    }
}
