package cts.s06.chain;

import java.util.List;

public class Candidat {
    private String nume;
    private int experientaAni;
    private List<String> competente;
    private boolean disponibilInterviu;
    private double asteptareSalariala;

    public Candidat(String nume, int experientaAni, List<String> competente, boolean disponibilInterviu, double asteptareSalariala) {
        this.nume = nume;
        this.experientaAni = experientaAni;
        this.competente = competente;
        this.disponibilInterviu = disponibilInterviu;
        this.asteptareSalariala = asteptareSalariala;
    }

    public String getNume() {
        return nume;
    }

    public int getExperientaAni() {
        return experientaAni;
    }

    public List<String> getCompetente() {
        return competente;
    }

    public boolean isDisponibilInterviu() {
        return disponibilInterviu;
    }

    public double getAsteptareSalariala() {
        return asteptareSalariala;
    }

    @Override
    public String toString() {
        return "Candidat{" +
                "nume='" + nume + '\'' +
                ", experientaAni=" + experientaAni +
                ", competente=" + competente +
                ", disponibilInterviu=" + disponibilInterviu +
                ", asteptareSalariala=" + asteptareSalariala +
                '}';
    }
}
