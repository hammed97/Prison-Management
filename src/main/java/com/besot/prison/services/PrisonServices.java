package com.besot.prison.services;

import com.besot.prison.entities.Inmate;
import com.besot.prison.entities.PrisonStaff;
import com.besot.prison.entities.Visitor;

import java.time.LocalDate;
import java.util.List;

public interface PrisonServices {
    void rehabilitation(Inmate inmate1);
    void reformation(Inmate inmate2);
    void reIntegration(Inmate inmate2);
    void regVisitors(Visitor visitor);
    List<Visitor> remVisitors(Visitor visitor);

}
