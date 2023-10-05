package Esercizio1;

public class Dipendente {
   private float stipendioBase = 1000;
   private int matricola;
   private double stipendio;
   private double importoOrarioStraordinario;
   private Livello livello;
   private Dipartimento dipartimento;


    public Dipendente(int matricola, Dipartimento dipartimento) {
        this.stipendioBase = 1000;
        this.matricola =matricola;
        this.importoOrarioStraordinario = 30;
        this.stipendio = this.stipendioBase;
        this.livello = Livello.OPERAIO;
        this.dipartimento = dipartimento;
    }

    public Dipendente(int matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.stipendioBase = 1000;
        this.matricola = matricola;
        this.stipendio = this.stipendioBase * stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    public float getStipendioBase() {
        return stipendioBase;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setImportoOrarioStraordinario(float importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = this.stipendioBase * stipendio;
    }

    public void setLivello(Livello livello) {
        this.livello = livello;
    }
    public void stampaDatiDipendente(){
        System.out.println("numero matricola: " + this.getMatricola() + " livello lavoratore: " + this.getLivello() + " lavora nel dipartimento: " + this.getDipartimento());
    }
    public void promuovi () {
        if (this.getLivello() == Livello.OPERAIO) {
            this.setLivello(Livello.IMPIEGATO);
            this.setStipendio(1.2);
            System.out.println("il nuovo livello del dipendente numero " + this.getMatricola() + " è " + this.getLivello());
        } else if (this.getLivello() == Livello.IMPIEGATO) {
            this.setLivello(Livello.QUADRO);
            this.setStipendio(1.5);
            System.out.println("il nuovo livello del dipendente numero " + this.getMatricola() + " è " + this.getLivello());
        } else if (this.getLivello()== Livello.QUADRO) {
            this.setLivello(Livello.DIRIGENTE);
            this.setStipendio(2);
            System.out.println("il nuovo livello del dipendente numero " + this.getMatricola() + " è " + this.getLivello());
        }else {
            System.out.println("Errore non esistono livelli più alti!");
        }
    }

}
