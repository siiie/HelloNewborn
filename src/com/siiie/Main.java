package com.siiie;

import com.siiie.Family.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        Family family = new Family();
        Child newborn = InitNewborn();
        Man yoel = InitYoel();
        Woman yael = InitYael();
        newborn.SetFather(yoel);
        newborn.SetMother(yael);
        family.AddChild(newborn);
        family.SetDad(yoel);
        family.SetMom(yael);

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
        PrintStringSlow(sentencesList.GetSentence(4) + newborn.GetAge());
        // Show family roles
        PrintStringSlow(sentencesList.GetSentence(6));
        family.GetFamilyMembers().forEach(fMember -> PrintStringSlow(((Person)fMember).FamilyRole()));

        ExecutorService tpes = Executors.newFixedThreadPool(family.GetFamilyMembers().size());
        // Execute life
        family.GetFamilyMembers()
                .stream()
                .filter(fMember -> fMember instanceof Runnable)
                .forEach(fMember -> tpes.execute((Runnable) fMember));

        tpes.shutdown();


    }

    private static Man InitYoel() {
        Man yoel = new Man();
        yoel.SetfName("Yoel");
        yoel.SetlName("Mimon");
        yoel.SetIsMarries(true);
        yoel.SetIsDad(true);

        // Some activities
        yoel.AddLifeActivity("No Sleep");
        yoel.AddLifeActivity("Cry");
        yoel.AddLifeActivity("Write Code");
        yoel.AddLifeActivity("Help Mor Coding");
        yoel.AddLifeActivity("Selfie With Newborn");

        return yoel;
    }

    private static Woman InitYael() {
        Woman yael = new Woman();
        yael.SetfName("Yael");
        yael.SetlName("Mimon");
        yael.SetIsMarries(true);
        yael.SetIsMom(true);

        // Some activities
        yael.AddLifeActivity("No Sleep");
        yael.AddLifeActivity("Cry");
        yael.AddLifeActivity("Smile");
        yael.AddLifeActivity("Waking Yoel to check why the baby is crying");

        return yael;
    }

    private static Child InitNewborn() {
        Child newborn = new Child();
        newborn.SetfName("Mor");

        // Some activities
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
