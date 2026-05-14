package cts.s06.chain;

public class FiltruAsteptareSalariala extends AbstractFiltruCandidat{

    @Override
    public boolean proceseaza(Candidat candidat) {
        if(candidat.getAsteptareSalariala()>8000){
            System.out.println("Asteptare salariala incompatibila --> CANDIDAT " + candidat.getNume() + " respins!");
            return false;
        } else if (this.urmator!=null) {
            return this.urmator.proceseaza(candidat);
        }else {
            System.out.println("Filtrare finalizata--> CANDIDAT " + candidat.getNume() + " ACCEPTAT!");
            return true;
        }
    }
}
