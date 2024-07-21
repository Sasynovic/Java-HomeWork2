public abstract class VeicoloAutonomo implements Comparable<VeicoloAutonomo>,Increasable{

    private int carica;
    private int kMPercorsi;
    private String id;

    public VeicoloAutonomo(int carica, int kMPercorsi, String Id){
        this.carica = carica;
        this.kMPercorsi = kMPercorsi;
        this.id = Id;
    }

    public int getKmPercorsi(){
        return this.kMPercorsi;
    }

    @Override
    public int compareTo(VeicoloAutonomo o) {
        return this.carica - o.carica;
    }
    @Override
    public String toString(){
        return "ID: " + this.id + "\tCarica: " + this.carica + "\tkMPercorsi: " + this.kMPercorsi;
    }
    @Override
    public boolean equals(Object obj){
        return this.id.equals(((VeicoloAutonomo)obj).id);
    }

    public abstract void increase(int value);
}


