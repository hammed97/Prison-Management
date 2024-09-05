package com.besot.prison.entities;

import java.time.LocalDate;

public class Inmate extends User {
    private Long prisonNo;
    private LocalDate dateIn;
    private LocalDate expDateOut;
    private String offenceClass;

    @Override
    public String toString() {
        return "{" +
                "name=" + getName() + " " +
                "prisonNo=" + prisonNo +
                ", dateIn=" + dateIn +
                ", expDateOut=" + expDateOut +
                ", offenceClass='" + offenceClass + '\'' +
                '}';
    }

    public Long getPrisonNo() {
        return prisonNo;
    }

    public void setPrisonNo(Long prisonNo) {
        this.prisonNo = prisonNo;
    }

    public LocalDate getDateIn() {
        return dateIn;

    }

    public void setDateIn(LocalDate dateIn) {
        this.dateIn = dateIn;
    }

    public LocalDate getExpDateOut() {
        return expDateOut;
    }

    public void setExpDateOut(LocalDate expDateOut) {
        this.expDateOut = expDateOut;
    }

    public String getOffenceClass() {
        return offenceClass;
    }

    public void setOffenceClass(String offenceClass) {
        this.offenceClass = offenceClass;
    }
}
