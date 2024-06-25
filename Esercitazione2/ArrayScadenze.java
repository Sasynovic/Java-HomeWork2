package Esercitazione2;

public class ArrayScadenze {
    public static void main(String[] args) {

    isScaduto[] scaduto = new isScaduto[8];

    scaduto[0] = new CartaID("Mario Rossi", new Data(2021, 12, 31));
    scaduto[1] = new CartaID("Luca Bianchi", new Data(2022, 12, 31));
    scaduto[2] = new CartaID("Giuseppe Verdi", new Data(2023, 12, 31));
    scaduto[3] = new CartaID("Giovanni Neri", new Data(2024, 12, 31));
    scaduto[4] = new ProdottoAlimentare("Latte", new Data(2021, 12, 31));
    scaduto[5] = new ProdottoAlimentare("Pane", new Data(2022, 12, 31));
    scaduto[6] = new ProdottoAlimentare("Pasta", new Data(2023, 12, 31));
    scaduto[7] = new ProdottoAlimentare("Riso", new Data(2024, 12, 31));

    for(int i = 0; i < scaduto.length; i++) {
        if (scaduto[i].isScaduto()) {
            System.out.println("L'elemento " + i + " è scaduto");
        } else {
            System.out.println("L'elemento " + i + " non è scaduto");
            }
        }
    }
}