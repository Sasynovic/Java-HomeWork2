package HomeWork3;

public class Zombie extends Personaggio{

    private static int zombieCount = 0;

    // definisco il costruttore per lo zombie. Incremento il contatore degli zombie ogni qualvolta ne viene creato uno
    public Zombie(int x, int y) {
        super(x, y);
        zombieCount++;
    }

    public int get_ZombieCount() {
        return zombieCount;
    }

    @Override
    public void die() {
        this.vivo = false;
        zombieCount--;
    }

    @Override
    public void move(Campo campo) {
        if (campo.isValidPosition(this.getX(), this.getY())) {
            int x = this.getX();
            int y = this.getY();
            int newX = x;
            int newY = y+1;
            campo.removePersonaggio(x, y);
        campo.placePersonaggio(newX, newY, this);
    } else if (!this.vivo) {
        System.out.println("Lo zombie è morto!");
    }else {
        System.out.println("Posizione non valida!");
        }
    }
}