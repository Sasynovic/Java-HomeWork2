package HomeWork4;
import java.util.Scanner;
import java.io.FileReader;

public class Candidato implements Loadable {

    private String cognome;
    private int eta;
    private String curriculum;
    private Azienda candidatura;
    private Titolo[] competenze;

    public Candidato() {
        this.cognome = "";
        this.eta = 0;
        this.curriculum = "";
    }
    public Candidato(String cognome, int eta, String curriculum) {
        this.cognome = cognome;
        this.eta = eta;
        this.curriculum = curriculum;
    }

    @Override
    public void LoadFromFile(String curriculum) throws Exception {

        FileReader file = new FileReader(curriculum);
        Scanner scanner = new Scanner(file);

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
