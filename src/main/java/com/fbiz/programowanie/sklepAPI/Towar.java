package com.fbiz.programowanie.sklepAPI;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Towar {
    @Id
    private long kod;
    private String nazwa;
    private float cena;

    public Towar(long kod, String nazwa, float cena) {
        this.kod = kod;
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public Towar(){}

    @Override
    public String toString() {
        return String.format(
                "Towar[kod=%d, nazwa='%s', cena='%.2f']",
                kod, nazwa, cena);
    }

    public long getKod() {
        return kod;
    }

    public String getNazwa() {
        return nazwa;
    }

    public float getCena() {
        return cena;
    }

    public void setKod(long kod) {
        this.kod = kod;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }
}
