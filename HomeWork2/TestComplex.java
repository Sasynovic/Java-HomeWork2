package HomeWork2;

public class TestComplex {
    public static void main(String[] args){
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        Complex c3 = new Complex(c1);
        c1.stampa();
        c2.stampa();
        c3.stampa();
        System.out.println("Modulo c1: " + c1.moduloComplex());
        System.out.println("Modulo c2: " + c2.moduloComplex());
        System.out.println("Modulo c3: " + c3.moduloComplex());
        Complex c4 = c1.sommaComplex(c2);
        c4.stampa();
        Complex c5 = c1.prodottoComplex(c2);
        c5.stampa();
        System.out.println("");

        ArrayComplex ac = new ArrayComplex();
        ac.BubbleSort(new Complex[]{c1, c2, c3, c4, c5}, 5);
        ac.PrintAll(new Complex[]{c1, c2, c3, c4, c5}, 5);
    }
}
