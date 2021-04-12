package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        GraService gra = new GraService();
        gra.dodajgre(new Gra("Tomb Raider", 99, "2003.02.12"));
        gra.dodajgre(new Gra("GTA", 149, "2008.02.08"));
        gra.dodajgre(new Gra("Mario Party", 239, "2012.07.09"));
        gra.dodajgre(new Gra("Empire Earth 2", 29, "2009.02.07"));
        gra.dodajgre(new Gra("Cyberpunk", 249, "2020.17.09"));

        //Sortowanie po nazwie ze względu na brak możliwości wyboru użytkownika, do rozszerzenia
        gra.sortgierk();
        gra.wypiszgry();

    }
}
