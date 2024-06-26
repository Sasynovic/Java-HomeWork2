package Esercitazione3.gestionemagazzino;
import java.util.Scanner;

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

        boolean trovato = false;
        int i = 0;

        while(!trovato || i < magazzino.length) {
            if (magazzino[i] != null && magazzino[i].getNomeProdotto().equals(name)) {
                System.out.println("Prodotto trovato in posizione: " + i);
                return true;
            }
            i++;

        }
        return false;
    }

    public void InserisciSingoloProdotto() {

        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci la posizione del prodotto da inserire: ");
        int i = input.nextInt();

        System.out.println("Inserisci il nome del prodotto: ");
        String nomeProdotto = input.next();
        System.out.println("Inserisci il costo del prodotto: ");
        double costo = input.nextDouble();
        System.out.println("Inserisci la quantità del prodotto: ");
        int quantita = input.nextInt();
        System.out.println("Inserisci il codice del prodotto: ");
        StringBuilder codice = new StringBuilder(input.next());

        magazzino[i] = new Prodotto(quantita, costo, nomeProdotto, codice);

        System.out.print("Prodotto inserito correttamente! " + magazzino[i].toString() + "\n");

    }

    public void CancellaSingoloProdotto(){
        // TODO implement here
    }
    public void StampaProdotti(){
        // TODO implement here
    }
    public void SalvaSuFile(){
        // TODO implement here
    }
    public void CaricaDaFile(){
        // TODO implement here
    }
}
