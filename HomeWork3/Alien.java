package HomeWork3;

public class Alien extends Personaggio {

    private static int alienCount = 0;

    // definisco il costruttore per l'alieno. Incremento il contatore degli alieni ogni qualvolta ne viene creato uno
    public Alien(int x, int y) {
            super(x, y);
            alienCount++;
    }

    public int get_AlienCount() {
        return alienCount;
    }

    @Override
    protected void die() {
        this.vivo = false;
        alienCount--;
    }

    @Override
    public void move(Campo campo) {
        int x = this.getX();
        int y = this.getY();
        int newX = x+1;
        int newY = y+1;

        if (((campo.isValidPosition(newX, newY) ) {
            campo.removePersonaggio(x, y);
            campo.placePersonaggio(newX, newY, this);
        } else if (!this.vivo) {
            System.out.println("L'alieno è morto!");
        } else {
            System.out.println("Posizione non valida o già occupata!");
        }
    }
}