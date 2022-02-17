package Array;

import java.util.Arrays;
import java.util.Scanner;

class ArrayImplementation{
    private int [] arr;

    public ArrayImplementation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array");
        int n = sc.nextInt();
        arr = new int[n];
        // we have set the default value of array to Integer.MIN_VALUE
        Arrays.fill(arr, Integer.MIN_VALUE);
    }
    public void traverse(){
        // method to print each value inside the array
        for(int res : arr){
            System.out.println(res);
        }
    }
    public void insert(int index, int value){
        // method to insert values inside the array
        try
        {
            if(arr[index] == Integer.MIN_VALUE){
                arr[index] = value;
            }
            else{
                System.out.println("location already filled");
            }
        }
        catch(ArrayIndexOutOfBoundsException err){
            System.out.println("Invalid index!!!");
        }
    }
}
public class Implementation {
    public static void main(String[] args) {
        ArrayImplementation obj = new ArrayImplementation();
        obj.insert(0,15);
        obj.traverse();
    }
}
