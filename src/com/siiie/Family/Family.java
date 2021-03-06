package com.siiie.Family;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<Object> familyMembers;
    private String familyName;
    private Person mom;
    private Person dad;
    private List<Child> childes;

    public Family() {
        this.childes = new ArrayList<>();
        this.familyMembers = new ArrayList<>();
    }

    public void AddChild(Child newChild){
        this.childes.add(newChild);
    }

    public Person GetMom() {
        return mom;
    }

    public void SetMom(Person mom) {
        this.mom = mom;
    }

    public Person GetDad() {
        return dad;
    }

    public void SetDad(Person dad) {
        this.dad = dad;
    }

    public String GetFamilyName() {
        return familyName;
    }

    public void SetFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public List<Object> GetFamilyMembers() {

        familyMembers.add(mom);
        familyMembers.add(dad);
        childes.forEach(child -> familyMembers.add(child));
        return familyMembers;
    }

    public List<Child> GetChilds(){
        return this.childes;
    }
}
