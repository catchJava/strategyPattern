package bfs;

import java.util.Scanner;
import java.util.Stack;

public class Dfs {

    int N, M = 0;
    Stack<Map> stack = new Stack();
    int map[][];
    boolean visited[][];
    int moveX[] = {0, 1, -1, 0};
    int moveY[] = {1, 0, 0, -1};

    static int shortestLength = 0;

    public Dfs(int n, int m, int[][] map){

        this.N = n;
        this.M = m;
        this.visited = new boolean[N][M];
        this.map = map;
        shortestLength = N * M;

    }

    public int searchStack(int x, int y, int length){

        stack.add(new Map(x, y, length, visited));

        while (!stack.isEmpty()){

            Map currentMap = stack.pop();
            currentMap.visited[currentMap.x][currentMap.y] = true;
            System.out.println("현재 좌표 : " + currentMap.x + " / " + currentMap.y);
            System.out.println("현재 길이 : " + currentMap.length);

            for(int i=0 ; i<4 ; i++){
                int nextX = currentMap.x + moveX[i];
                int nextY = currentMap.y + moveY[i];

                if(nextX == N-1 && nextY == M-1) {
                    finish(currentMap.length + 1);
                    continue;
                }

                if(currentMap.length + 1 >= shortestLength){
                    continue;
                }

                if(isVisit(nextX, nextY, currentMap)) {
                    stack.push(new Map(nextX, nextY, currentMap.length + 1, currentMap.visited));
                }
            }
        }

        return shortestLength;
    }

    private int finish(int length) {
        if(shortestLength == 0)
            shortestLength = length;

        if(length < shortestLength)
            shortestLength = length;

        return length;
    }

    public boolean isVisit(int x, int y, Map currentMap) {
        if (x >= 0 && x < N && y >= 0 && y < M)
            if (map[x][y] == 1 && !currentMap.visited[x][y])
                return true;

        return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] NM = scanner.nextLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        int map[][] = new int[N][M];

        for(int i=0 ; i < N ; i++){
            String str = scanner.nextLine().trim();
            for(int j=0 ; j<str.length() ; j++){
                map[i][j] = str.charAt(j) - '0';
            }
        }

        Dfs dfs = new Dfs(N, M, map);
        int result = dfs.searchStack(0, 0, 1);


        System.out.println("result : " + result);


    }
}
