package HomeWork2;
import java.util.Scanner;

public class ArrayComplex {
    public static void main(String[] args) {
    }

    // inserisci i valori da tastiera
    public void InsertComplexFromTerminal(Complex[] array, int DIM) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < DIM; i++) {
            System.out.print("Inserisci la parte reale: ");
            double reale = input.nextDouble();
            System.out.print("Inserisci la parte immaginaria: ");
            double immaginaria = input.nextDouble();

            array[i] = new Complex(reale, immaginaria);
        }
    }

    // stampa tutti gli elementi
    public void PrintAll(Complex[] array, int DIM) {
        for (int i = 0; i < DIM; i++) {
            array[i].stampa();
        }
    }

    //ordina per modulo gli elementi
    public void BubbleSort(Complex[] array, int DIM) {
        for (int i = 0; i < DIM - 1; i++) {
            for (int j = 0; j < DIM - i - 2; j++) {
                if (array[j].moduloComplex() > array[j+1].moduloComplex()) {
                    Complex temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
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

