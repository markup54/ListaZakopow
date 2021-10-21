package com.example.listazakopow_new;

public class Produkt {
    private String nazwa;
    private boolean zaznaczony;

    public Produkt(String nazwa) {
        this.nazwa = nazwa;
        this.zaznaczony=false;
    }

    @Override
    public String toString() {
        return nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public boolean isZaznaczony() {
        return zaznaczony;
    }

    public void setZaznaczony(boolean zaznaczony) {
        this.zaznaczony = zaznaczony;
    }
}
