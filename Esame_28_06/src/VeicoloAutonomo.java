public abstract class VeicoloAutonomo implements Increasable{

    private int carica;
    private int kMPercorsi;
    private String id;

    public VeicoloAutonomo(int carica, int kMPercorsi, String Id){
        this.carica = carica;
        this.kMPercorsi = kMPercorsi;
        this.id = Id;
    }

    @Override
    public String toString(){
        return "circo";
    }
    @Override
    public boolean equals(Object obj){
        return this.id.equals(((VeicoloAutonomo)obj).id);
    }

    public abstract void increase(int value);
}
