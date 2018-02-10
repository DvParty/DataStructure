package maze;

public class Main2 {
    public static class Maze {
        public Maze() {
            System.out.println("starting maze...");
            printMaze();
            findMazePath(0, 0);
            printMaze();
        }
        private int N = 8;
        private int[][] maze = {
                {0, 0, 0, 0, 0, 0, 0, 1},
                {0, 1, 1, 0, 1, 1, 0, 1},
                {0, 1, 1, 1, 0, 0, 0, 1},
                {0, 0, 0, 1, 0, 0, 0, 1},
                {1, 1, 0, 0, 1, 1, 1, 0},
                {0, 1, 0, 0, 0, 1, 0, 1},
                {0, 0, 0, 1, 0, 0, 0, 1},
                {0, 1, 1, 1, 0, 1, 0, 0}
        };
        private static final int PATHWAY = 0;
        private static final int WALL = 1;
        private static final int BLOCKED = 2;
        private static final int PATH = 3;

        private boolean[][] visit = new boolean[N][N];

        private boolean isExit(int x, int y) {
            return x == N-1 && y == N-1;
        }

        private boolean findMazePath(int x, int y) {
            // bc1: 갈 수 없는 곳일 때
            if (x < 0 || x >= N || y < 0 || y >= N) {
                return false;
            }
            if (maze[x][y] != PATHWAY) {
                return false;
            }
            //  bc2: 현재 위치가 출구일때
            else if (isExit(x, y)) {
                System.out.println("visit: " + x + "," + y + "/" + maze[0].length + maze.length);
                maze[x][y] = PATH;
                return true;
            } else {
                visit[x][y] = true;
                // 만약 여기와 인접한 곳에 출구가 있고 여기도 길이라면
                if (findMazePath(x-1, y) || findMazePath(x, y-1) || findMazePath(x+1, y)|| findMazePath(x, y+1)) {
                    maze[x][y] = PATH;
                    return true;
                } else {
                    maze[x][y] = BLOCKED;
                    return false;
                }
            }
        }

        private void printMaze() {
            for (int i = 0; i < maze.length; i++) {
                for (int j = 0; j < maze[0].length; j++) {
                    System.out.print(maze[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


    public static void main(String[] args) {
        Maze m = new Maze();
    }
}


//출처: http://jizard.tistory.com/136 [JIZARD]