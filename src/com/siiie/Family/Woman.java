package com.siiie.Family;


public class Woman extends Person {

    private boolean isMom;
    private boolean isMarries;

    @Override
    String FamilyRole() {
        if (isMom){
            return "Mom";
        }else if(isMarries){
            return "Wife";
        }else{
            return "Bachelor";
        }

    }
}