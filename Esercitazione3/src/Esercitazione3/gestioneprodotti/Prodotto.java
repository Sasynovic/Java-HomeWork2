package Esercitazione3.gestioneprodotti;

public class Prodotto  {

    protected int quantita;
    protected double costoBase;
    private String nomeProdotto;
    private StringBuilder codice;

    public Prodotto(int quantita, double costoBase, String nomeProdotto, StringBuilder codice) {
        this.quantita = quantita;
        this.costoBase = costoBase;
        this.nomeProdotto = nomeProdotto;
        this.codice = codice;
    }

    /*
    @Override
    public boolean equals(Object obj) {
        // TODO implement here
    }
    @Override
    public String toString() {
        // TODO implement here
    }
    */
    public double calcolaCosto() {
        double ris = this.costoBase * this.quantita;
        return ris;
    }
    /*
    public boolean checkCodice() {
        // TODO implement here
    }
     */

    public String getNomeProdotto() {
        return this.nomeProdotto;
    }
}
