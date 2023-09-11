package com.example.model;

public class Sell {
    private int sid;
    private  int gid;
    private  String gname;
    private int stock;
    private double price;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    @Override
    public String toString() {
        return "Sell{" +
                "sid=" + sid +
                ", gid=" + gid +
                ", gname='" + gname + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                '}';
    }
}
