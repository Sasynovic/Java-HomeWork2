package Esercitazione3.gestioneprodotti;

public class ProdottoAlimentare extends Prodotto{

    private boolean scontato;
    private StringBuilder provenienza;

    public ProdottoAlimentare(int quantita, double costoBase, String nomeProdotto, StringBuilder codice, boolean scontato, StringBuilder provenienza) {
        super(quantita, costoBase, nomeProdotto, codice);
        this.scontato = scontato;
        this.provenienza = provenienza;
    }
}
