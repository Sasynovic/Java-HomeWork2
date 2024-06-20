package HomeWork3;

public abstract class Personaggio {

    private int x;
    private int y;
    protected boolean vivo;

    // costruttore
    public Personaggio(int x, int y) {
        this.x = x;
        this.y = y;
        this.vivo = true;
    }

    // metodi set e get per X e Y
    public int getX() {
        return this.x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        this.y = y;
    }

    // metodo per muovere il personaggio
    public abstract void move(Campo campo);

    //metodo per impostare vivo a false
    protected abstract void die();
}
