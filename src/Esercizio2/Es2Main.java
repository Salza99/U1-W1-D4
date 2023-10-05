package Esercizio2;

import Esercizio1.Dipartimento;
import Esercizio1.Dipendente;
import Esercizio1.Livello;

public class Es2Main {
    public static void main(String[] args) {
        Dipendente a = new Dipendente(3,1,10, Livello.OPERAIO, Dipartimento.PRODUZIONE);
        Dipendente b = new Dipendente(4,1,10, Livello.OPERAIO, Dipartimento.PRODUZIONE);
        Dipendente c = new Dipendente(5,1.2,13.5, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);
        Dipendente d = new Dipendente(6,2,30, Livello.DIRIGENTE, Dipartimento.VENDITE);
        a.promuovi();
        c.promuovi();
        a.stampaDatiDipendente();
        b.stampaDatiDipendente();
        c.stampaDatiDipendente();
        d.stampaDatiDipendente();
        Dipendente[] arrayDiDipendenti = {a, b, c, d};

        calcolaTutteLePagheEStraordinari(arrayDiDipendenti);

    }
    public static void calcolaTutteLePagheEStraordinari(Dipendente[] a){
        double stipendioComplessivo = 0;
        double strordinariSingoli;
        for (Dipendente dipendente : a) {
            strordinariSingoli = dipendente.getImportoOrarioStraordinario() * 5;
            stipendioComplessivo += dipendente.getStipendio() + strordinariSingoli;
        }
        System.out.println("gli stipendi complessivi, comprensivi di 5 ore di straordinario per ogni dipendente è: " + stipendioComplessivo);

    }
}
