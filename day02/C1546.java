package day02;
import java.util.Scanner;

public class C1546 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        int max = 0;
        double average = 0.0;
        Long sum = 0L;
        for(int i = 0 ; i<n; i++){
            scores[i] = sc.nextInt();
        }
        for(int i = 0 ; i<n; i++){
            if(scores[i]> max) max= scores[i];
            sum += scores[i];
        }
        average = sum * 100 /n /max;
        System.out.println(max);
        System.out.println(sum);
        System.out.println(average);

    }
}
