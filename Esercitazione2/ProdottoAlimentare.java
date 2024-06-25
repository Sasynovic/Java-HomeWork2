package Esercitazione2;

public class ProdottoAlimentare implements isScaduto {

    private String descrizione;
    private Data dataScadenza;

    public ProdottoAlimentare(String descrizione, Data dataScadenza) {
        this.descrizione = descrizione;
        this.dataScadenza = dataScadenza;
    }

    @Override
    public boolean isScaduto() {
        Data dataCorrente = new Data();
        return  dataCorrente.isAfter(dataScadenza);
    }

    @Override
    public String toString() {
        return "Prodotto Alimentare: " + descrizione + " scade il " + dataScadenza;
    }
}
