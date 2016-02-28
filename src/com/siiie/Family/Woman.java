package com.siiie.Family;


public class Woman extends Person {

    private boolean isMom;
    private boolean isMarries;

    @Override
    public String FamilyRole() {
        if (isMom){
            return "Mom";
        }else if(isMarries){
            return "Wife";
        }else{
            return "Bachelor";
        }

    }


    public void SetIsMom(boolean mom) {
        isMom = mom;
    }

    public void SetIsMarries(boolean marries) {
        isMarries = marries;
    }
}
