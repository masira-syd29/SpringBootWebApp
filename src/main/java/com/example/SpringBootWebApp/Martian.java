package com.example.SpringBootWebApp;

public class Martian {
    private int aid;
    private String aname;

    @Override
    public String toString() {
        return "Martian{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                '}';
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }
}
