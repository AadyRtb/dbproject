package com.example.model;

public class Buy {
    private int uid;
    private  int sid;
    private  int gid;
    private String gname;
    private  int number;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    @Override
    public String toString() {
        return "Buy{" +
                "uid=" + uid +
                ", sid=" + sid +
                ", gid=" + gid +
                ", gname='" + gname + '\'' +
                ", number=" + number +
                '}';
    }
}
