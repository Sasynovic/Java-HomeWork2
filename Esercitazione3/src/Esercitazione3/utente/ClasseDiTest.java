package Esercitazione3.utente;
import Esercitazione3.gestionemagazzino.Magazzino;
import Esercitazione3.gestioneprodotti.Prodotto;

import java.util.Scanner;

public class ClasseDiTest {

    public static void main(String[] args) {
        Magazzino magazzino = new Magazzino();
        magazzino.InserisciSingoloProdotto();
        magazzino.InserisciSingoloProdotto();

        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il nome del prodotto da cercare: ");
        String nome = input.next();

        System.out.print(magazzino.searchForName(nome));
    }

    public void CaricaDaFile() {
        // TODO implement here
    }
}
