package com.example.formofarmor;

public class OrderGS {
    String names, rty,qty;

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getRty() {
        return rty;
    }

    public void setRty(String rty) {
        this.rty = rty;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public OrderGS(String names, String rty, String qty) {
        this.names = names;
        this.rty = rty;
        this.qty = qty;
    }
}
