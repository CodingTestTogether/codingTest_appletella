package day03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간합구하기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int[][] table = new int[N+1][N+1];
        for(int i=1; i<=N ; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j=1; j<=N ; j++){
                table[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        int[][] sum = new int[N+1][N+1];
        for(int i=1;i<=N;i++){
            for(int j=1; j<=N ; j++){
                sum[i][j] = sum[i][j-1] + sum[i-1][j] - sum[i-1][j-1] + table[i][j];
            }
        }

        for(int i=0;i<M;i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());
            int result = sum[x2][y2] - sum[x1-1][y2] - sum[x2][y1-1] + sum[x1-1][y1-1];
            System.out.println(result);
        }
    }
}
