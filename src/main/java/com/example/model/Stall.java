package com.example.model;

public class Stall {
    private int sid;
    private  int oid;
    private  String state;
    private  double income;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "stall{" +
                "sid=" + sid +
                ", oid=" + oid +
                ", state='" + state + '\'' +
                ", income=" + income +
                '}';
    }
}
