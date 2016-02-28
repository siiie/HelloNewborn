package com.siiie;

import java.util.ArrayList;
import java.util.List;


public class Constants {
    List<String> sentencesList;

    public Constants() {
        sentencesList = new ArrayList<>();
        this.sentencesList.add("Hello Yoel");                                                                       // 0
        this.sentencesList.add("Please choose your newborn name: ");                                                // 1
        this.sentencesList.add("Newborn name is: ");                                                                // 2
        this.sentencesList.add("What is the birthday of the newborn (dd/mm/yyyy) ? ");                              // 3
        this.sentencesList.add("Newborn age :");                                                                     // 4
        this.sentencesList.add("Our time machine is not available at the moment, please try later. \nGoodbye!");    // 5

    }

    public String GetSentence(int index) {
        if (index >= 0 && index < this.sentencesList.size()){
            return this.sentencesList.get(index);
        }
        LogClass.ShowLog("Constants", "GetSentence", "Index out of range");
        return "";


    }
}
