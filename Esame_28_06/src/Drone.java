public class Drone extends VeicoloAutonomo{

    private int altezzaCorrente;

    public Drone(int carica, int kMPercorsi, String id, int altezzaCorrente){
        super(carica, kMPercorsi, id);
        this.altezzaCorrente = altezzaCorrente;
    }

    @Override
    public String toString(){
        return "circo";
    }
    @Override
    public boolean equals(Object obj){
        if(super.equals(obj)){
        if(obj instanceof Drone){
                if(this.altezzaCorrente == ((Drone)obj).altezzaCorrente){
                    return true;
                }
                else{
                    return false;
                }
            }else{
                return false;
            }
         }else{
            return false;
        }
    }

    @Override
    public void increase(int value) {
        this.altezzaCorrente += value;
    }
}
