package HomeWork4;
import java.util.Scanner;
import java.io.Path;

public class Candidato implements Loadable {

    private String cognome;
    private int eta;
    private String curriculum;
    private Azienda candidatura;  // Azienda che ha ricevuto la candidatura - come la uso??
    private Titolo[] competenze;


    public Candidato(String cognome, int eta, String curriculum,int titoli) {
        this.cognome = cognome;
        this.eta = eta;
        this.curriculum = curriculum;
        this.competenze = new Titolo[titoli];
    }

    @Override
    public void LoadFromFile(String curriculum) throws Exception {

        Scanner scanner = new Scanner(;

        try{
            if(scanner.hasNextLine()) {
                this.cognome = scanner.nextLine();
            }else {
                System.out.print("Il file non contiene dati");
            }if(scanner.hasNextLine()){
                this.eta = Integer.parseInt(scanner.nextLine());
            }if(scanner.hasNextLine()){
                this.curriculum = scanner.nextLine();

            }
            System.out.println("\nEcco i dati del candidato: ");
            System.out.println("Cognome: " + this.getCognome());
            System.out.println("Eta: " + this.getEta());
            System.out.println("Curriculum: " + this.getCurriculum());
        }catch(Exception e){
            System.out.println("Errore nella lettura del file.");
        }
    }

    public String getCognome(){
        return this.cognome;
    }
    public int getEta(){
        return this.eta;
    }
    public String getCurriculum(){
        return this.curriculum;
    }

}
