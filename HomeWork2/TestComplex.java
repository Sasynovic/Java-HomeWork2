package HomeWork2;
import java.util.Scanner;

public class TestComplex {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        final int DIM;

        ArrayComplex ac = new ArrayComplex();

        int x;

        System.out.println("\n************************************");
        System.out.println("Inizializzazione dell'array.");
        System.out.print("Inserisci il numero di elementi che comporra' l'array. Il numero non sara' modificabile:\t");
        DIM = input.nextInt();
        Complex[] array = new Complex[DIM];
        System.out.println("************************************");
        System.out.println("Inserisci i valori da tastiera");
        ac.InsertComplexFromTerminal(array, DIM);

        do{
            System.out.println("\n************************************");
            ac.PrintMenu();
            System.out.println("************************************");
            System.out.print("Inserisci la tua scelta: ");
            x = input.nextInt();

            switch(x){
                case 1:
                    System.out.println("\nInserisci i valori da tastiera.E' possibile inserire fino a "+ DIM + " elementi.");
                    ac.InsertComplexFromTerminal(array, DIM);
                    break;
                case 2:
                    System.out.println("\nStampa tutti gli elementi.");
                    ac.PrintAll(array, DIM);
                    break;
                case 3:
                    System.out.println("\nOrdina per modulo gli elementi.");
                    ac.BubbleSort(array, DIM);
                    break;
                case 4:
                    System.out.print("\nRicerca di un elemento.\nInserisci la parte reale: ");
                    double reale = input.nextDouble();
                    System.out.print("Inserisci la parte immaginaria: ");
                    double immaginaria = input.nextDouble();

                    int[] pos = new int[DIM];
                    Complex e = new Complex(reale, immaginaria);
                    if(ac.search(array, DIM, e, pos)){
                        System.out.println("\nElemento trovato in posizione:");
                        for (int i : pos) {
                                System.out.println(i);
                        }
                    } else {
                        System.out.println("Elemento non trovato.");
                    }
                    break;
                case 5:
                    System.out.println("\nStampa tutti i moduli.");
                    ac.PrintAllModules(array, DIM);
                    break;
                case 0:
                    System.out.println("Uscita.");
                    break;
                default:
                    System.out.println("Scelta non valida.");
                    break;
            }
        }while(x!=0);
        input.close();
    }
}
