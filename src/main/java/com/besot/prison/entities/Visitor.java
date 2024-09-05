package com.besot.prison.entities;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Visitor extends User{
    public static List<Visitor> listOfVisitiors =new ArrayList<>();
    private LocalDateTime timeIn;
    private LocalTime timeOut;

    public LocalDateTime getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(LocalDateTime timeIn) {
        this.timeIn = timeIn;
    }

    public LocalTime getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(LocalTime timeOut) {
        this.timeOut = timeOut;
    }

    @Override
    public String toString() {
        return "{" +
                "Visitor name="+ getName() +
                ", timeIn=" + timeIn + getTimeIn() +
                ", timeOut=" + timeOut + getTimeOut() +
                '}';
    }

    public Visitor(LocalDateTime timeIn) {
        this.timeIn = timeIn;
    }
}
