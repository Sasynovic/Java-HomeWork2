package Esercitazione3.gestionemagazzino;

// importo le classi necessarie da altri package dello stesso progetto
import Esercitazione3.utilities.Searchable;
import Esercitazione3.gestioneprodotti.Prodotto;

public class Magazzino implements Searchable {

    public Prodotto[] magazzino;

    public Magazzino() {
        magazzino = new Prodotto[50];
    }

    @Override
    public boolean searchForCode(String code) {
        return false;
    }
    @Override
    public boolean searchForName(String name) {
        return false;
    }
}
