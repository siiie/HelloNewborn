package com.siiie;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<Person> familyMembers;
    private String familyName;
    private Person mom;
    private Person dad;

    public Family(List<Person> familyMembers) {
        this.familyMembers = new ArrayList<>();
    }

    public void AddFamilyMember(Person newMember){
        this.familyMembers.add(newMember);
    }

    public Person getMom() {
        return mom;
    }

    public void setMom(Person mom) {
        this.mom = mom;
    }

    public Person getDad() {
        return dad;
    }

    public void setDad(Person dad) {
        this.dad = dad;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}
