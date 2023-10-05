package Esercizio1;

import Esercizio1.Dipartimento;
import Esercizio1.Dipendente;
import Esercizio1.Livello;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Invio with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Dipendente a = new Dipendente(0, 1, 30, Livello.OPERAIO, Dipartimento.VENDITE );
        Dipendente b = new Dipendente(1,1.2, 30, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE);

        a.stampaDatiDipendente();
        b.stampaDatiDipendente();
        a.promuovi();
        calcolaPaga(b);
        calcolaPaga(a, 5);

    }


    public static void calcolaPaga (Dipendente a) {
        System.out.println("lo stipendio mensile percepito dal dipendente numero " + a.getMatricola() + " è di " + a.getStipendio());
    }
    public static void calcolaPaga(Dipendente a, int ore) {
        double straordinari = ore * a.getImportoOrarioStraordinario();
        double totaleStipendio = straordinari + a.getStipendio();
        System.out.println("il dipendente numero " + a.getMatricola() + " ha maturato uno stipendio complessivo di " + totaleStipendio);
    }
}