package com.siiie.Family;

public class Man extends Person {

    private boolean isDad;
    private boolean isMarries;

    @Override
    public String FamilyRole() {

        String role;
        if (isDad){
            role = "Dad";
        }else if(isMarries){
            role = "Husband";
        }else{
            role =  "Bachelor";
        }

        return this.GetfName() + " is " + role;

    }

    public void SetIsDad(boolean dad) {
        isDad = dad;
    }

    public void SetIsMarries(boolean marries) {
        isMarries = marries;
    }
}
