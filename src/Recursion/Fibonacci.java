package Recursion;

public class Fibonacci {
    public static int Logic( int n){
        if (n==0){
            return 0;
        }
        if (n==1 || n==2 ){
            return 1;
        }
        return Logic(n-1) + Logic(n-2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Logic(i));
        }

    }
}
