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
}
