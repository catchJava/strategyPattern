package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bfs {

    int N, M;
    boolean visit[][];
    int map[][];
    int moveX[] = {0, 1, -1, 0};
    int moveY[] = {1, 0, 0, -1};
    Queue<Map> queue = new LinkedList<>();

    public Bfs(int N, int M, int[][] map){
        this.N = N;
        this.M = M;
        visit = new boolean[N][M];

        this.map = map;
    }

    public int search(int x, int y, int length){

        queue.add(new Map(x, y, length));

        while(!queue.isEmpty()){

            Map currentMap = queue.poll();
            visit[currentMap.x][currentMap.y] = true;

            System.out.println("현재 좌표 : " + currentMap.x + " / " + currentMap.y);
            System.out.println("현재 길 : " + currentMap.length);

            for(int i=0 ; i<4 ; i++){
                int nextX = currentMap.x + moveX[i];
                int nextY = currentMap.y + moveY[i];

                if(nextX == N-1 && nextY == M-1){
                    return currentMap.length + 1;
                }

                if(nextX >= 0 && nextX < N && nextY >= 0 && nextY < M){
                    if(visit[nextX][nextY] == false && map[nextX][nextY] == 1){
                        queue.add(new Map(nextX, nextY, currentMap.length + 1));
                    }
                }
            }
        }

        return -1;

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

        Bfs bfs = new Bfs(N, M, map);
        int result = bfs.search(0, 0, 1);


        System.out.println("result : " + result);
    }
}
