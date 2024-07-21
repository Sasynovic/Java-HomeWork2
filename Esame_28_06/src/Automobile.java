public class Automobile extends VeicoloAutonomo{

    private int velocitaCorrente;

    public Automobile(int carica, int kMPercorsi, String id, int velocitaCorrente){
        super(carica, kMPercorsi, id);
        this.velocitaCorrente = velocitaCorrente;
    }

    @Override
    public String toString(){
        return "\tAutomobile { " + super.toString() + "\tvelocitaCorrente:\t" + this.velocitaCorrente + " }";
    }
    @Override
    public boolean equals(Object obj){
        if(super.equals(obj)){
        if(obj instanceof Automobile){
            if(this.velocitaCorrente == ((Automobile)obj).velocitaCorrente){
                return true;
            }
            else{
                return false;
            }
        }else{
            return false;
        }
    }else
            return false;
    }

    @Override
    public void increase(int value) {
        this.velocitaCorrente += value;
    }
}
