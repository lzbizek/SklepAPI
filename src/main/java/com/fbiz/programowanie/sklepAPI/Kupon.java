package com.fbiz.programowanie.sklepAPI;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Kupon {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private long kodTowaru;
    private int ilosc;
    private float cena;

    public Kupon(){}

    public Kupon(long kodTowaru, int ilosc, float cena) {
        this.kodTowaru = kodTowaru;
        this.ilosc = ilosc;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return String.format(
                "Kupon[id=%d, kodTowaru='%d', ilosc='%d', cena='%.2f']",
                id, kodTowaru, ilosc, cena);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getKodTowaru() {
        return kodTowaru;
    }

    public void setKodTowaru(long kodTowaru) {
        this.kodTowaru = kodTowaru;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }
}
