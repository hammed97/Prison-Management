package com.besot.prison.serviceimpli;

import com.besot.prison.entities.Inmate;
import com.besot.prison.entities.PrisonStaff;
import com.besot.prison.entities.Visitor;
import com.besot.prison.services.PrisonServices;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class CorrectionsServices implements PrisonServices {


    @Override
    public void rehabilitation(Inmate inmate1) {
        System.out.println(inmate1.getName() + " Is being rehabilitated!!");
    }

    @Override
    public void reformation(Inmate inmate2) {
        System.out.println(inmate2.getName() + " Is being reformed!!");
        System.out.println("Prisoner information under reformation is : "+ inmate2);
        System.out.println("Specific crime: "+ inmate2.getOffenceClass());
    }

    @Override
    public void reIntegration(Inmate inmate2) {

    }

    @Override
    public void regVisitors(Visitor visitor1) {
        Visitor.listOfVisitiors.add(visitor1);
//        Visitor.listOfVisitiors.remove(visitor1);
        visitor1.setTimeIn(LocalDateTime.now());
        System.out.println(Visitor.listOfVisitiors+" Displaying all registered Visitors");
    }

    @Override
    public List<Visitor> remVisitors(Visitor visitor1) {
        Visitor.listOfVisitiors.remove(visitor1);
        return visitor1.listOfVisitiors;
    }
}
