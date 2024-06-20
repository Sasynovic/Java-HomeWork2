package HomeWork3;

public class Campo {

    private Personaggio[][] grid;

    public Campo(int size) {
        this.grid = new Personaggio[size][size];
    }

    public Personaggio[][] getGrid() {
        return grid;
    }

    public void placePersonaggio(int x, int y, Personaggio personaggio) {
        if(grid[x][y] == null)
        {
            this.grid[x][y] = personaggio;
        }
    }

    public void removePersonaggio(int x, int y) {
        this.grid[x][y] = null;
    }

    public boolean isValidPosition(int x, int y) {
        return ((x >= 0 && x < this.grid.length) && (y >= 0 && y < this.grid.length));
    }

    public boolean gameover() {
        return false;
    }
}
