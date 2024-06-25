package HomeWork2;
import java.lang.Math;

public class Complex {

    private double re;
    private double imm;

    // Definisco costruttore con 2 valori e costruttore di copa
    public Complex(double re, double imm) {
        this.re = re;
        this.imm = imm;    }
    public Complex(Complex c) {
        this.re = c.re;
        this.imm = c.imm;
    }

    // Definisco getter e setter per impostare valori reali ed immaginari
    public double getRe() {
        return re;
    }
    public double getImm() {
        return imm;
    }
    public void setRe(double re) {
        this.re = re;
    }
    public void setImm(double imm) {
        this.imm = imm;
    }

    // metodi necessari
    public void stampa(){
        System.out.println("Re: " + this.re + " Imm: " + this.imm);
    }
    public double moduloComplex(){
        return Math.sqrt(re*re + imm*imm);
    }
    public Complex sommaComplex(Complex c) {
        return new Complex(this.re + c.re, this.imm + c.imm);
    }
    public Complex prodottoComplex(Complex c) {
        return new Complex(this.re*c.re, this.imm*c.imm);
    }
}