package com.company;

public class Gra {
    private String tytul;
    private int cena;
    private String datawyd;

    Gra(String tytul, int cena, String datawyd) {
        this.tytul = tytul;
        this.cena = cena;
        this.datawyd = datawyd;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getDatawyd() {
        return datawyd;
    }

    public void setDatawyd(String datawyd) {
        this.datawyd = datawyd;
    }

}
