package com.fbiz.programowanie.sklepAPI;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pracownik {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private long pesel;
    private String imie;
    private String nazwisko;
    private int poziomUprawnien;
    private float wynagrodzenie; //miesieczne

    public Pracownik(){}

    public Pracownik(long pesel, String imie, String nazwisko, int poziomUprawnien, float wynagrodzenie) {
        this.pesel = pesel;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.poziomUprawnien = poziomUprawnien;
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    public String toString() {
        return String.format(
                "Pracownik[id=%d, pesel='%d', imie='%s', nazwisko='%s', poziomUprawnien='%d', wynagrodzenie='%.2f']",
                id, pesel, imie, nazwisko, poziomUprawnien, wynagrodzenie);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getPoziomUprawnien() {
        return poziomUprawnien;
    }

    public void setPoziomUprawnien(int poziomUprawnien) {
        this.poziomUprawnien = poziomUprawnien;
    }

    public float getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(float wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }
}
