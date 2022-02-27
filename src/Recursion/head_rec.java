package Recursion;

public class head_rec {
    // in it the flow is from base condition
    public static void a(int n){
        if (n==0){
            return;
        }
        a(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        a(5);
    }
}
