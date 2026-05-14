package cts.s07.strategy;

public class Ruta {
    private String punctPlecare;
    private String destinatie;
    private int timp;
    private int distanta;
    private int cost;
    private int nrStatii;

    public Ruta(String punctPlecare, String destinatie, int timp, int distanta, int cost, int nrStatii) {
        this.punctPlecare = punctPlecare;
        this.destinatie = destinatie;
        this.timp = timp;
        this.distanta = distanta;
        this.cost = cost;
        this.nrStatii = nrStatii;
    }

    public String getPunctPlecare() {
        return punctPlecare;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public int getTimp() {
        return timp;
    }

    public int getDistanta() {
        return distanta;
    }

    public int getCost() {
        return cost;
    }

    public int getNrStatii() {
        return nrStatii;
    }

    @Override
    public String toString() {
        return "Ruta{" +
                "punctPlecare='" + punctPlecare + '\'' +
                ", destinatie='" + destinatie + '\'' +
                ", timp=" + timp +
                ", distanta=" + distanta +
                ", cost=" + cost +
                ", nrStatii=" + nrStatii +
                '}';
    }
}
