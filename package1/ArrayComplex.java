package package1;
import java.util.Scanner;

public class ArrayComplex {
    public static void main(String[] args) {
    }

    //inserisci numeri complessi da terminale utilizzando lo scanner
    public void InsertComplexFromTerminal(Complex[] array, int DIM) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < DIM; i++) {
            System.out.print("Inserisci la parte reale: ");
            double reale = input.nextDouble();
            System.out.print("Inserisci la parte immaginaria: ");
            double immaginaria = input.nextDouble();

            array[i] = new Complex(reale, immaginaria);
        }

        input.close();
    }

    //stampami tutti i valori presenti nell'array
    public void PrintAll(Complex[] array, int DIM) {
        for (int i = 0; i < DIM; i++) {
            array[i].stampa();
        }
    }

    //ordina per modulo gli elementi
    public void BubbleSort(Complex[] array, int DIM) {
        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM - i - 1; j++) {
                if (array[i].moduloComplex() > array[j].moduloComplex()) {
                    Complex temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // metodo di ricerca
    public boolean search(Complex[] array, int DIM, Complex e, int pos) {

        boolean trovato=false;
        int i=0;
        while(!trovato && i<DIM){
            for(int j=0;j<DIM;j++){
                if(array[i].moduloComplex() == e.moduloComplex()){
                    pos = j;
                    return trovato = true;
                }
                i++;
            }
        }
        return trovato;
    }
}

