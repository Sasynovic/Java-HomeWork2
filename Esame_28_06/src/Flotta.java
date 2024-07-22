import java.io.IOException;
import java.nio.file.Paths;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Flotta {
    public static void main(String[] args) {

        Lista lista = new Lista();

        System.out.println("*******************************\nInizio del programma.\nProviamo ad inserire manualmente due droni e due auto. Confrontiamoli per verificare se i metodi di base funzionano correttamente.\n");

        //testo l'equals inserendo due oggetti uguali e due non uguali
        Drone d = new Drone(50, 10, "drone1", 100);
        Drone d1 = new Drone(100, 100, "drone1", 101);

        Automobile a = new Automobile(50, 10, "auto", 120);
        Automobile a1 = new Automobile(100, 100, "auto", 120);

        System.out.println("Il primo drone è:\t"+d.toString());
        System.out.println("Il secondo drone è:\t"+d1.toString());
        System.out.println("");
        System.out.println("La prima auto è:\t"+a.toString());
        System.out.println("La seconda auto è:\t"+a1.toString());
        System.out.println("");
        System.out.println("Il confronto tra i primi due droni ha restituito :\t"+d.equals(d1));
        System.out.println("Il confronto tra le prime due auto ha restituito :\t"+a.equals(a1));

        System.out.println("");
        leggiDaFile("flotta.txt", lista);

        lista.kmMediPerTipoVeicolo();

        Drone veicolo = new Drone(101, 10, "dronek231", 54);

        lista.inserisciConOrdine(veicolo);

        System.out.print("\nProgramma Terminato.\n********************************\n");
    }

    public static void leggiDaFile(String nomeFile, Lista lista) {

        try{
            Scanner input = new Scanner(Paths.get("C:\\Users\\Elly\\IdeaProjects\\Java-OOP_Unina1\\Esame_28_06\\src\\Flotta.txt"));
            int numelementi = input.nextInt();
            System.out.println("Carico i dati dal documento inserito...");

            for (int i= 0; i< numelementi; i++){
                String classe = input.next();

                if (classe.equals("VeicoloAutonomo.Drone")){
                    int carica = input.nextInt();
                    int kmPercorsi = input.nextInt();
                    String id = input.next();
                    int altezzaCorrente = input.nextInt();

                    Drone d = new Drone(carica, kmPercorsi, id, altezzaCorrente);
                    lista.insert(d);

                }else if (classe.equals("VeicoloAutonomo.Automobile")){
                    int carica = input.nextInt();
                    int kmPercorsi = input.nextInt();
                    String id = input.next();
                    int velocitaCorrente = input.nextInt();

                    Automobile a = new Automobile(carica, kmPercorsi, id, velocitaCorrente);
                    lista.insert(a);
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("File non trovato");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}