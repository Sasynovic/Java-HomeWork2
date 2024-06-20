package HomeWork3;

public class Zombie extends Personaggio{

    private static int zombieCount = 0;

    // definisco il costruttore per lo zombie. Incremento il contatore degli zombie ogni qualvolta ne viene creato uno
    public Zombie(int x, int y) {
        super(x, y);
        zombieCount++;
    }

    public static int get_ZombieCount() {
        return zombieCount;
    }

    @Override
    public void die() {
        this.vivo = false;
        zombieCount--;
    }

    @Override
    public void move(Campo campo) {
        int x = this.getX();
        int y = this.getY();
        int newX = x+1;
        int newY = y+1;

        if (campo.isValidPosition(newX, newY) && !(campo.getGrid()[newX][newY] instanceof Zombie)) {
            campo.removePersonaggio(x, y);
            campo.placePersonaggio(newX, newY, this);
            this.setX(newX);
            this.setY(newY);
        } else if (!this.vivo) {
            System.out.println("Lo zombie è morto!");
        } else {
            System.out.println("Posizione non valida o già occupata!");
        }
    }
}