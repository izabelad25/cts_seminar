package cts.s07.composite;

import java.util.ArrayList;
import java.util.List;

public class NodTransport extends ANod{
    private List<ANod> listaCopii;

    public NodTransport(String tipNod) {
        super(tipNod);
        this.listaCopii = new ArrayList<>();
    }

    @Override
    public void adaugaNod(ANod nod) {
        if(nod!=null && !nod.getClass().getSimpleName().equals(NodTransport.class)){
            listaCopii.add(nod);
        }
    }

    @Override
    public void stergeNod(ANod nod) {
        if(listaCopii.contains(nod)){
            listaCopii.remove(nod);
        }
    }

    @Override
    public ANod getNod(int index) {
        return listaCopii.get(index);
    }

    @Override
    public int calculeazaNumarPasageri() {
        int total = 0;
        for(ANod nod:listaCopii){
            total+=nod.calculeazaNumarPasageri();
        }
        return total;
    }

    @Override
    public boolean verificaCapacitate(int capacitateMaxima) {
        for(ANod nod:listaCopii){
            if(!nod.verificaCapacitate(capacitateMaxima)){
                System.out.println("Capacitate maxima!");

                return false;

            }
        }
        System.out.println("Nu a fost atinsa capacitatea maxima!");
        return true;
    }

    @Override
    public String afisare() {
        String info = this.getTipNod()+" -> " +this.calculeazaNumarPasageri()+ " PASAGERI TOTAL \n";
        for(ANod nod:listaCopii){
            info+=nod.afisare();
        }
        return info;
    }
}
