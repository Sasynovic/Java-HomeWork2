package HomeWork3;

public class Campo {

    private Personaggio[][] grid;

    public Campo(int size) {
        this.grid = new Personaggio[size][size];
    }

    public Personaggio[][] getGrid() {
        return grid;
    }

    public boolean isValidPosition(int x, int y) {
        return (x >= 0 && x < grid.length && y >= 0 && y < grid.length);
    }

    public void placePersonaggio(int x, int y, Personaggio personaggio) {
        if(grid[x][y]!=null) {
            grid[x][y].die();
        }
        this.grid[x][y] = personaggio;
    }

    public void removePersonaggio(int x, int y) {
        this.grid[x][y] = null;
    }

    public Personaggio whois(int x, int y) {
        return grid[x][y];
    }

    public boolean gameover() {
        return Alien.get_AlienCount() == 0 || Zombie.get_ZombieCount() == 0;
    }
}
