package cts.s07.strategy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StrategieMinTimp implements AbstractAlgoritmRuta{
    @Override
    public Ruta calculeazaRuta(ReteaTransport retea, String statieStart, String statieFinal) {
        List<Ruta> copie = new ArrayList<>(retea.getListaRute());
        copie.stream().allMatch(ruta -> ruta.getPunctPlecare()==statieStart && ruta.getDestinatie()==statieFinal);
        copie.sort(Comparator.comparing(Ruta::getTimp));
        Ruta rezultat = copie.getFirst();
        return rezultat;
    }
}
