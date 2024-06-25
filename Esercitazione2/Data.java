package Esercitazione2;

public class Data {

    private final int giorno;
    private final int mese;
    private final int anno;

    public Data() {
        this.giorno = 25;
        this.mese = 6;
        this.anno = 2024;
    }
    public Data(int anno, int mese, int giorno) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }

    public boolean isAfter(Data data) {
        if (this.anno > data.anno) {
            return true;  // se l'anno e' maggiore ritorna true
        } else if (this.anno == data.anno) {
            if (this.mese > data.mese) {
                return true; // se l'anno e' uguale e il mese e' maggiore ritorna true
            } else if (this.mese == data.mese) {
                return this.giorno > data.giorno; // se l'anno e' uguale e il mese e' uguale e il giorno e' maggiore ritorna true
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return giorno + "/" + mese + "/" + anno;
    }
}
