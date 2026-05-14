package cts.s06.adapter;

public class Adapter implements ICandidatExtern{
    private ICandidatIntern referinta;

    public Adapter(ICandidatIntern referinta) {
        this.referinta = referinta;
    }

    private CandidatIntern transformareFormat(CandidatExtern candidatExtern){
       return new CandidatIntern(candidatExtern.getNume(), candidatExtern.getAniExperienta(), candidatExtern.getCompetente());
    }


    @Override
    public void trimiteCV(Platforma platforma, CandidatExtern candidatExtern) {
        System.out.println("Adapter activ...");
        System.out.println("..modificare format cv");
        referinta.trimiteCV(platforma, transformareFormat(candidatExtern));

    }
}
