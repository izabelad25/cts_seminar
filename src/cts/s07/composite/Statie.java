package cts.s07.composite;

public class Statie extends ANod{
    private String nume;
    private int nrPasageri;

    public Statie(String tipNod, String nume, int nrPasageri) {
        super(tipNod);
        this.nume = nume;
        this.nrPasageri = nrPasageri;
    }

    @Override
    public void adaugaNod(ANod nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeNod(ANod nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ANod getNod(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int calculeazaNumarPasageri() {
        return this.nrPasageri;
    }

    @Override
    public boolean verificaCapacitate(int capacitateMaxima) {
        return this.nrPasageri<capacitateMaxima;
    }

    @Override
    public String afisare() {
        return "    "+ this.getTipNod()+" -> "+this.nume + " "+ this.nrPasageri+ " pasageri\n";
    }
}
