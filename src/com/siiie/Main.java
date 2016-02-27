package com.siiie;

import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Months;
import org.joda.time.Years;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person newborn;
        Person yoel;
        newborn = InitNewborn();
        yoel = InitYoel();

        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        Constants sentencesList = new Constants();

        PrintStringSlow(sentencesList.GetSentence(0));
        PrintStringSlow(sentencesList.GetSentence(1));
        // User string input
        String inputName = scanner.nextLine();

        if (!inputName.isEmpty()){
            newborn.SetfName(inputName);
        }

        sb.append(sentencesList.GetSentence(2)).append(newborn.GetfName());
        PrintStringSlow(sb.toString());

        PrintStringSlow(sentencesList.GetSentence(3));
        String date = scanner.nextLine();

        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date birth = formatter.parse(date);
            Date now = new Date();
            if (birth.after(now)){
                PrintStringSlow(sentencesList.GetSentence(5));
                System.exit(0);
            }else{
                newborn.SetBirthDate(birth);
            }
        } catch (ParseException e) {
            LogClass.ShowLog("Main", "main", e.toString());
        }

        // Newborn Age
        PrintStringSlow("Newborn age: " +newborn.GetAge());


        // Newborn life
        newborn.start();
        // Yoel life
        yoel.start();

    }

    private static Person InitYoel() {
        Person yoel = new Person();
        yoel.SetfName("Yoel");
        yoel.SetlName("Mimon");
        yoel.AddLifeActivity("No Sleep");
        yoel.AddLifeActivity("Cry");
        yoel.AddLifeActivity("Write Code");
        yoel.AddLifeActivity("Help Mor Coding");
        yoel.AddLifeActivity("Selfie With Newborn");

        return yoel;
    }

    private static Person InitNewborn() {
        Person newborn = new Person();
        newborn.SetfName("Mor");
        newborn.AddLifeActivity("Cry");
        newborn.AddLifeActivity("Sleep");
        newborn.AddLifeActivity("Drool");

        return newborn;
    }

    public static void PrintStringSlow(String str){
        if(str.isEmpty()){System.exit(0);}
        for (int i = 0; i < str.length(); i++) {

            System.out.print(""+str.charAt(i));
            try {
                Thread.sleep(50); //250
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("");
    }

    public static void Sleep(int milliSec){
        try {
            Thread.sleep(milliSec);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
