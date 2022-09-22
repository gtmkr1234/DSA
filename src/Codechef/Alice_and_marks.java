package Codechef;

import java.util.Scanner;

public class Alice_and_marks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if(a>=b*2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
