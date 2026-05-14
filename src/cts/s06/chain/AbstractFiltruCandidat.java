package cts.s06.chain;

public abstract class AbstractFiltruCandidat {
    protected AbstractFiltruCandidat urmator;
    public void seteazaUrmator(AbstractFiltruCandidat urmator) {
        this.urmator = urmator;
    }
    public abstract boolean proceseaza(Candidat candidat);
}
