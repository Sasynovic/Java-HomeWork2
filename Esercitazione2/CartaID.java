package Esercitazione2;

public class CartaID implements isScaduto{

    private String nome;
    private Data dataScadenza;

    public CartaID(String nome, Data dataScadenza) {
        this.nome = nome;
        this.dataScadenza = dataScadenza;
    }

    @Override
    public boolean isScaduto() {
        Data dataCorrente = new Data();
        return  dataCorrente.isAfter(dataScadenza);
    }

    @Override
    public String toString() {
        return "CartaID: " + nome + " scade il " + dataScadenza;
    }
}
