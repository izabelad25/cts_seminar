package cts.s06.adapter;

public class CandidatExtern implements ICandidatExtern{
    private String nume;
    private int aniExperienta;
    private String[] competente;

    public CandidatExtern(String nume, int aniExperienta, String[] competente) {
        this.nume = nume;
        this.aniExperienta = aniExperienta;
        this.competente = competente;
    }

    public String getNume() {
        return nume;
    }

    public int getAniExperienta() {
        return aniExperienta;
    }

    public String[] getCompetente() {
        return competente;
    }

    @Override
    public void trimiteCV(Platforma platforma, CandidatExtern candidatExtern) {
        System.out.println("CV trimis prin metoda EXTERNA");

    }
}
