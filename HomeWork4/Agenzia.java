package HomeWork4;

import java.util.Scanner;

public class Agenzia {

    public static void main(String[] args) throws Exception {
        System.out.println("************************************");
        System.out.println("Benvenuto nell'agenzia di collocamento!");
        System.out.println("************************************");
        Scanner input = new Scanner(System.in);
        Candidato candidato1 = new Candidato();

        System.out.print("\nInserisci il nome del file da leggere: ");
        String curriculum = "C:\\Users\\Barre\\IdeaProjects\\Java-OOP_Unina\\HomeWork4\\"+input.next();
        System.out.println("\nCarico i dati dal file: " + curriculum + "...");
        candidato1.LoadFromFile(curriculum);
    }
}