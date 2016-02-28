package com.siiie.Family;

import com.siiie.Life;
import com.siiie.LogClass;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Months;
import org.joda.time.Years;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public abstract class Person extends Thread implements Life {
    private Random random = new Random();

    private String fName;
    private String lName;
    private Date birthDate;

    private List<String> lifeActivities;

    // C'tor
    public Person() {
        this.lifeActivities = new ArrayList<>();
    }

    // Get/Set methods

    public String GetfName() {
        return fName;
    }

    public void SetfName(String fName) {
        this.fName = fName;
    }

    public String GetlName() {
        return lName;
    }

    public void SetlName(String lName) {
        this.lName = lName;
    }

    public void AddLifeActivity(String activity){
        this.lifeActivities.add(activity);
    }

    public String GetFullName() {
        return this.fName + " " + this.lName;
    }

    public Date GetBirthDate() {
        return birthDate;
    }

    public void SetBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String GetAge(){

        StringBuilder sb = new StringBuilder();
        Years ageYears = Years.yearsBetween(new LocalDate(this.GetBirthDate()), new LocalDate());
        Months ageMonths = Months.monthsBetween(new LocalDate(this.GetBirthDate()), new LocalDate());
        Days ageDays = Days.daysBetween(new LocalDate(this.GetBirthDate()), new LocalDate());

        return sb.append(ageYears.getYears() + " years, " + ageMonths.getMonths() + " months, " + ageDays.getDays() + " days").toString();
    }

    // Interface implementation
    @Override
    public void LiveLife() {
        if (lifeActivities.size() > 0){
            String activity = lifeActivities.get(random.nextInt(lifeActivities.size()));
            System.out.println(this.fName + ": " + activity);
        }else {
            LogClass.ShowLog("Person", "LiveLife", "No life activity available");
        }

    }
    // Thread runnable method
    public void run(){
        for (int i = 0; i < 15; i++) {
            this.LiveLife();
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // Abstract methods
    public abstract String FamilyRole();

}
