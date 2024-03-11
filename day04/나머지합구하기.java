package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 나머지합구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        long[] S = new long[N];
        long[] remainderCount = new long[M];
        long count = 0;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0 ; i<N ; i++){
            if(i == 0){
                S[i] = Integer.parseInt(stringTokenizer.nextToken());
            }else{
                S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        for(int i = 0 ; i<N ; i++){
            int remainder = (int) (S[i] % M);
            if(remainder == 0){
                count++;
            }
            remainderCount[remainder]++;
        }
        for(int i = 0 ; i<M ; i++){
            if(remainderCount[i]>1){
                count = count + (remainderCount[i] *(remainderCount[i] - 1))/2;
            }
        }
        System.out.println(count);

    }
}
