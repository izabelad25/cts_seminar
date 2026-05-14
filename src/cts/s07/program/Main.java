package cts.s07.program;

import cts.s07.composite.ANod;
import cts.s07.composite.NodTransport;
import cts.s07.composite.Statie;
import cts.s07.strategy.ReteaTransport;
import cts.s07.strategy.Ruta;
import cts.s07.strategy.StrategieCostMin;
import cts.s07.strategy.StrategieMinTimp;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //strategy
        ReteaTransport stb = new ReteaTransport(List.of(
                new Ruta("p romana", "busan", 50,100, 100, 10 ),
                new Ruta("p romana", "busan", 20,100, 150, 10 ),
                new Ruta("p romana", "busan", 50,100, 150, 10 ),
                new Ruta("p romana", "china", 150,100, 120, 10 ),
                new Ruta("p romana", "china", 50,100, 150, 10 )
        ));

        stb.setStrategie(new StrategieCostMin());
        System.out.println(stb.oferaRuta("p romana", "busan"));

        stb.setStrategie(new StrategieMinTimp());
        System.out.println(stb.oferaRuta("p romana", "china"));


        System.out.println("----COMPOSITE---");
        ANod nodTransport = new NodTransport("NOD TRANSPORT");
        nodTransport.adaugaNod(new Statie("Statie", "statie", 40));
        nodTransport.adaugaNod(new Statie("Statie", "numestatie", 11));
        nodTransport.adaugaNod(new Statie("Statie", "statiealta", 20));
        nodTransport.adaugaNod(new Statie("Statie", "copac", 5));
        nodTransport.adaugaNod(new Statie("Statie", "andreipopa", 8));

        ANod nodTransport2 = new NodTransport("NOD TRANSPORT2");
        nodTransport2.adaugaNod(new Statie("StatieAAAAAAA", "statie", 40));
        nodTransport2.adaugaNod(new Statie("Statie", "noapte b u n a", 11));
        System.out.println(nodTransport.afisare());
        System.out.println(nodTransport2.afisare());

        nodTransport.verificaCapacitate(10);
    }
}
