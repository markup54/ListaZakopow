package com.example.listazakopow_new;

import java.util.ArrayList;

public class ListaZakopow {
    public ArrayList<Produkt> produkty = new ArrayList<>();

    public ListaZakopow() {
        this.produkty.add(new Produkt("Masło"));
        this.produkty.add(new Produkt("Chleb"));
        this.produkty.add(new Produkt("Bułki"));
        this.produkty.add(new Produkt("Ser"));
        this.produkty.add(new Produkt("Mleko"));
        this.produkty.add(new Produkt("Woda"));
        this.produkty.add(new Produkt("Cukier"));
        this.produkty.add(new Produkt("Sok"));
        this.produkty.add(new Produkt("Cukier"));
    }
}
