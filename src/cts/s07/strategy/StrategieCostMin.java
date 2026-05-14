package cts.s07.strategy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StrategieCostMin implements AbstractAlgoritmRuta{
    @Override
    public Ruta calculeazaRuta(ReteaTransport retea, String statieStart, String statieFinal) {
        List<Ruta> copie = new ArrayList<>(retea.getListaRute());
        copie.sort(Comparator.comparing(Ruta::getCost));
        Ruta rezultat = copie.getFirst();
        return rezultat;
    }
}
