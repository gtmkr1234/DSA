package Array;

import java.util.Scanner;

class ArrayImplementation{
    private int [] arr;

    public ArrayImplementation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array");
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public void traverse(){
        for(int res : arr){
            System.out.println(res);
        }
    }
}
public class Implementation {
    public static void main(String[] args) {
        ArrayImplementation obj = new ArrayImplementation();
        obj.traverse();
    }

}
