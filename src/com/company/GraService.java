package com.company;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GraService {
    private GraRepository repository = new GraRepository();

    public void dodajgre(Gra gra) {
        repository.getLista().add(gra);
        sortgierk();
    }

    public void usungre(Gra gra) {
        repository.getLista().remove(gra);
    }

    public List<Gra> listagier() {
        return repository.getLista();
    }

    public void wypiszgry() {
        for (Gra x : listagier()) {
            System.out.println(x.getTytul());
        }
    }

    public void wypiszgry(int c) {
        for (Gra x : listagier()) {
            if (x.getCena() < c) System.out.println(x.getTytul());
        }
    }

    public void sortgierk() {
        Collections.sort(repository.getLista(), new Comparator<Gra>() {
            public int compare(Gra o1, Gra o2) {
                return o1.getTytul().compareTo(o2.getTytul());
            }
        });
    }


}
