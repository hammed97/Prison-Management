package com.besot;

import com.besot.prison.entities.Inmate;
import com.besot.prison.entities.PrisonStaff;
import com.besot.prison.entities.User;
import com.besot.prison.entities.Visitor;
import com.besot.prison.entities.enums.Rank;
import com.besot.prison.serviceimpli.CorrectionsServices;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrisonStaff staff1 = new PrisonStaff();
        staff1.setName("James");
        staff1.setRank(Rank.warden_2);

        Inmate prisoner1 = new Inmate();
        prisoner1.setName("Ade");
        prisoner1.setOffenceClass("Tax evasion");
        prisoner1.setAge(18);
        prisoner1.setGender(User.Gender.Male);
        prisoner1.setPrisonNo(54235L);
        prisoner1.setDateIn(LocalDate.of(2023,10,12));
        prisoner1.setExpDateOut(LocalDate.of(2023,11,12));
        CorrectionsServices service1= new CorrectionsServices();

        service1.reformation(prisoner1);

        Visitor visitor1 = new Visitor(LocalDateTime.now());
        visitor1.setName("Tayo");
        visitor1.setTimeOut(LocalTime.NOON);
        visitor1.setAddress("Orchid Road, Lekki Ajah Lagos Nigeria");
        visitor1.setGender(User.Gender.Female);
        visitor1.setPhoneNo(8130229749L);


        CorrectionsServices reg = new CorrectionsServices();
        reg.regVisitors(visitor1);

    }
}