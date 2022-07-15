import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static int N, M;
    static char[][] map;
    static boolean[][][][] visit;

    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=  new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new char[N][M];
        visit = new boolean[N][M][N][M];

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){

            }
        }




    }
}

class Marble{
    int red_r;
    int red_c;

    int blue_r;
    int blue_c;

    int cnt;

    public Marble(int red_r, int red_c, int blue_r, int blue_c, int cnt) {
        this.red_r = red_r;
        this.red_c = red_c;
        this.blue_r = blue_r;
        this.blue_c = blue_c;
        this.cnt = cnt;
    }

}