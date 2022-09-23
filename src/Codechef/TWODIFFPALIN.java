package Codechef;

import java.util.Scanner;

public class TWODIFFPALIN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for (int i = 0; i < a; i++) {
            int m = s.nextInt();
            int n = s.nextInt();
            if((m%2==0 && n%2==0) && m==n){
                System.out.println("Yes");
            }
            else if(m%2==0 || n%2==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
