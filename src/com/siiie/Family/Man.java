package com.siiie.Family;

public class Man extends Person {

    private boolean isDad;
    private boolean isMarries;

    @Override
    String FamilyRole() {
        if (isDad){
            return "Dad";
        }else if(isMarries){
            return "Husband";
        }else{
            return "Bachelor";
        }

    }

    public void SetIsDad(boolean dad) {
        isDad = dad;
    }

    public void SetIsMarries(boolean marries) {
        isMarries = marries;
    }
}
