package com.besot.prison.entities;

import com.besot.prison.entities.enums.Rank;

public class PrisonStaff extends User {

    public PrisonStaff() {
        super();
    }

    private Rank rank;

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "{" +
                "rank=" + rank +
                '}';
    }
}
