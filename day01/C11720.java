package day01;
import java.util.Scanner;

public class C11720{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        String numString = sc.next();
        char[] numchar = numString.toCharArray();
        long sum = 0;
        for(int i = 0; i<num ; i++){
            sum += numchar[i] - '0';
        }
        System.out.println(sum);
        sc.close();
    }
}