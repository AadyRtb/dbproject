package com.example.model;

public class Owner {
    private int oid;
    private String oname;
    private String ophone;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public String getOphone() {
        return ophone;
    }

    public void setOphone(String ophone) {
        this.ophone = ophone;
    }

    @Override
    public String toString() {
        return "owner{" +
                "oid=" + oid +
                ", oname='" + oname + '\'' +
                ", ophone='" + ophone + '\'' +
                '}';
    }
}
