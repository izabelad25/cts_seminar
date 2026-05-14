package cts.s06.program;

import cts.s06.adapter.Adapter;
import cts.s06.adapter.CandidatExtern;
import cts.s06.adapter.CandidatIntern;
import cts.s06.adapter.Platforma;
import cts.s06.chain.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] competente = { "c++", "java", "piton"};
        CandidatIntern candidatIntern = new CandidatIntern("andrei popa intern", 2, competente);
        CandidatExtern candidatExtern = new CandidatExtern("extern andrei popa", 4, competente);

        System.out.println("---INITIAL---");
        candidatIntern.trimiteCV(new Platforma(),candidatIntern);
        candidatExtern.trimiteCV(new Platforma(), candidatExtern);
        System.out.println("\n");
        System.out.println("-------------");
        Adapter adapter = new Adapter(candidatIntern);
        adapter.trimiteCV(new Platforma(),candidatExtern);

        System.out.println("\n");
        System.out.println("\n");
        System.out.println("---CHAIN----");

        Candidat andreiPopa = new Candidat("Andrei Popa", 3, List.of("C++", "java", "Python"), true, 7000);
        Candidat andreiPopa2 = new Candidat("Andrei Popa1", 1, List.of("C++", "java", "Python"), true, 9000);
        Candidat andreiPopa3 = new Candidat("Andrei Popa2", 4, List.of( "java", "Python"), true, 7000);

        AbstractFiltruCandidat f1 = new FiltruAsteptareSalariala();
        AbstractFiltruCandidat f2 = new FiltruExperientaMinima();
        AbstractFiltruCandidat f3 = new FiltruCompetenteObligatorii();

        f1.seteazaUrmator(f2);
        f2.seteazaUrmator(f3);

        f1.proceseaza(andreiPopa);
        f1.proceseaza(andreiPopa2);
        f1.proceseaza(andreiPopa3);

        System.out.println("---schimbare ordine filtre---");
        f1.seteazaUrmator(f3);
        f3.seteazaUrmator(f2);
        f2.seteazaUrmator(null);

        f1.proceseaza(andreiPopa);
        f1.proceseaza(andreiPopa2);
        f1.proceseaza(andreiPopa3);

    }
}