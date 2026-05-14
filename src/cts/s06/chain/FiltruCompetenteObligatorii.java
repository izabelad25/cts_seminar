package cts.s06.chain;

public class FiltruCompetenteObligatorii extends AbstractFiltruCandidat{

    @Override
    public boolean proceseaza(Candidat candidat) {
        if(!candidat.getCompetente().contains("C++")){
            System.out.println("Competente insuficiente--> CANDIDAT " + candidat.getNume() + " respins!");
            return false;
        } else if (this.urmator!=null) {
            return this.urmator.proceseaza(candidat);
        }else {
            System.out.println("Filtrare finalizata--> CANDIDAT " + candidat.getNume() + " ACCEPTAT!");
            return true;
        }
    }
}
