package com.example.model;

public class Good {
    private int gid;
    private String gname;

    private String type;

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Good{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
