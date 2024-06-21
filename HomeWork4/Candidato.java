package HomeWork4;
import java.io.File;
import java.io.FileReader;

public class Candidato implements Loadable {

    private String cognome;
    private int eta;
    private String curriculum;
    Azienda candidatura;
    Titolo competenze;

    public Candidato(String cognome, int eta, String curriculum) {
        this.cognome = cognome;
        this.eta = eta;
        this.curriculum = curriculum;
    }

    @Override
    public void LoadFromFile() {

        FileReader file = new FileReader("Candidati.txt");

        if (file.exists()) {
            System.out.println("File trovato");
        } else {
            System.out.println("File non trovato");
        }

    }
}
