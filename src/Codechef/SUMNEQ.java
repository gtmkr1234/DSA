package Codechef;

import java.util.Scanner;

public class SUMNEQ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int count=0;
        for (int i = 1; i <=a ; i++) {
            for (int j = 1; j <=a; j++) {
                if (i + j == a)
                    count++;
            }
        }
        System.out.println(count);
    }
}
