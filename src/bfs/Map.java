package bfs;

public class Map {

    int x, y = 0;
    int length = 0;
    boolean visited[][];

    public Map(int x, int y, int length, boolean visited[][]){
        this.x = x;
        this.y = y;
        this.length = length;
        this.visited = visited.clone();
    }

    public Map(int x, int y, int length){
        this.x = x;
        this.y = y;
        this.length = length;
    }
}
