package HomeWork2;
import java.util.Scanner;

public class TestComplex {
    public static void main(String[] args){

        final int DIM = 6;

        ArrayComplex ac = new ArrayComplex();
        Complex[] array = new Complex[DIM];

        System.out.println("Inserisci i valori da tastiera.");
        ac.InsertComplexFromTerminal(array, DIM);
        System.out.println("\nStampa tutti gli elementi.");
        ac.PrintAll(array, DIM);
        System.out.println("\nOrdina per modulo gli elementi.");
        ac.BubbleSort(array, DIM);
        System.out.println("\nStampa tutti gli elementi.");
        ac.PrintAll(array, DIM);

        System.out.print("\nRicerca di un elemento.\nInserisci la parte reale: ");
        Scanner input = new Scanner(System.in);
        double reale = input.nextDouble();
        System.out.print("Inserisci la parte immaginaria: ");
        double immaginaria = input.nextDouble();
        input.close();
        Complex e = new Complex(reale, immaginaria);

        int[] pos = new int[DIM];
        if(ac.search(array, DIM, e, pos)){
            System.out.println("\nElemento trovato in posizione:");
            for (int i : pos) {
                    System.out.println(pos[i]);
            }
        } else {
            System.out.println("Elemento non trovato.");
        }

        input.close();

    }
}
