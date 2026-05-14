package cts.s06.adapter;

import java.util.Arrays;

public class Platforma implements AbstractCandidatPlatforma{
    private CandidatIntern candidatIntern;

    public void incepeProcesarea(CandidatIntern candidatIntern) {
        this.candidatIntern = candidatIntern;
        System.out.println("Procesare cv...");
        System.out.println("NUME --> " + this.obtineNume());
        System.out.println("ANI EXPERIENTA --> " + this.obtineAniExperienta());
        System.out.println("COMPETENTE --> " + Arrays.toString(this.obtineCompetente()));
    }

    @Override
    public String obtineNume() {
        return this.candidatIntern.getNume();
    }

    @Override
    public int obtineAniExperienta() {
        return this.candidatIntern.getAniExperienta();
    }

    @Override
    public String[] obtineCompetente() {
        return this.candidatIntern.getCompetente();
    }
}
