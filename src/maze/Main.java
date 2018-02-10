package maze;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int[][] graph = new int[100][100];
    static boolean[][] visited = new boolean[100][100];
    static int n = 0;
    static int m = 0;
    static int len[] = { 0, 0, 1, -1 };
    static int wid[] = { 1, -1, 0, 0 };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      /*  n = input.nextInt();
        m = input.nextInt();*/
n=20;
m=20;

        String nString = "3";
        for (int i = 0; i < n; i++) {
           ///nString = input.next();
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(nString.charAt(j) + "");
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                visited[i][j] = false;
            }
        }

        find();
    }

    private static void find() {

        int roadCount = 0;
        int qSize;
        int temp;
        int r;
        int c;
        int finish = 0;

        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(0);

        while (finish != 1) {
            qSize = q.size();

            for (int i = 0; i < qSize; i++) {
                temp = q.poll();
                r = temp / 100;
                c = temp % 100;

                if (r == n - 1 && c == m - 1) {
                    roadCount++;
                    System.out.println(roadCount);
                    finish = 1;
                }

                for (int j = 0; j < 4; j++) {
                    int nr = r + wid[j];
                    int nc = c + len[j];

                    if (nr >= n || nr < 0 || nc >= m || nc < 0)
                        continue;

                    if (graph[nr][nc] == 0)
                        continue;

                    if (visited[nr][nc])
                        continue;

                    visited[nr][nc] = true;
                    q.offer(nr * 100 + nc);
                }
            }
            roadCount++;
        }
    }
}

/*

출처: http://javannspring.tistory.com/175 [지경's 공부공간]

        출처: http://javannspring.tistory.com/175 [지경's 공부공간]*/
