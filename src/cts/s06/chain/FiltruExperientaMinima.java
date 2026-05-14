package cts.s06.chain;

public class FiltruExperientaMinima extends AbstractFiltruCandidat{

    @Override
    public boolean proceseaza(Candidat candidat) {
        if(candidat.getExperientaAni()<2){
            System.out.println("Experienta insuficienta --> CANDIDAT " + candidat.getNume() + " respins!");
            return false;
        }else if (this.urmator!=null) {
            return this.urmator.proceseaza(candidat);
        }else {
            System.out.println("Filtrare finalizata--> CANDIDAT " + candidat.getNume() + " ACCEPTAT!");
            return true;
        }
    }
}
