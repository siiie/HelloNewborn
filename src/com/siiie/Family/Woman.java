package com.siiie.Family;


public class Woman extends Person {

    private boolean isMom;
    private boolean isMarries;

    @Override
    public String FamilyRole() {

        String role;
        if (isMom){
            role = "Mom";
        }else if(isMarries){
            role = "Wife";
        }else{
            role = "Bachelor";
        }

        return GetfName() + " is " + role;
    }


    public void SetIsMom(boolean mom) {
        isMom = mom;
    }

    public void SetIsMarries(boolean marries) {
        isMarries = marries;
    }
}
