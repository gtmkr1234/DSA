package tests;
import java.util.PriorityQueue;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

// Question -
/*             an array is given in which we have to add the longest subsequence in a priority queue
*/
public class test1 {
    int n;
    int [] arr;
    public test1(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n = s.nextInt();
        arr = new int[n];
        System.out.println("Enter the " + n + " elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
    }
    public boolean isEmpty(int arr[]){
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            counter ++;
        }
        if(counter == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean oddCounter(int arr[]){
        int counter =0;
        for(int i: arr){
            if(i%2!=0){
                counter ++;
            }
        }
        if(counter == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
class exe{
    public static void main(String[] args) {
        test1 obj = new test1();
        if(obj.isEmpty(obj.arr)){
            System.out.println("empty array");
        }
        else{
            if(obj.oddCounter(obj.arr)){
                System.out.println("Can not perform the operation!!!");
            }
            else{
                PriorityQueue <Integer> obj1 = new PriorityQueue<>();
            }
        }
    }
}