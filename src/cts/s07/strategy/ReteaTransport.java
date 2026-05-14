package cts.s07.strategy;

import java.util.List;

public class ReteaTransport {
    private List<Ruta> listaRute;
    private AbstractAlgoritmRuta strategie;

    public ReteaTransport(List<Ruta> listaRute) {
        this.listaRute = listaRute;
        this.strategie = null;
    }

    public List<Ruta> getListaRute() {
        return listaRute;
    }

    public AbstractAlgoritmRuta getStrategie() {
        return strategie;
    }

    public void setStrategie(AbstractAlgoritmRuta strategie){
        if(strategie!=null){
            System.out.println("Strategie calcul ruta setata --> "+strategie.getClass().getSimpleName());
            this.strategie=strategie;
        }
    }

    public Ruta oferaRuta(String statieStart, String statieFinal){
        return strategie.calculeazaRuta(this, statieStart, statieFinal);

    }

}
