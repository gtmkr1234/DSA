package Array.Implementation;

import java.util.Arrays;

import static java.lang.System.*;

class ArrayImplementation{
    private int [] arr;

    public ArrayImplementation(int size) {
        arr = new int[size];
        // we have set the default value of array to Integer.MIN_VALUE
        Arrays.fill(arr, Integer.MIN_VALUE);
    }
    public void traverse(){
        // method to print each value inside the array
        for(int res : arr){
            out.println(res);
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
                out.println("location already filled");
            }
        }
        catch(ArrayIndexOutOfBoundsException err){
            out.println("Invalid index!!!");
        }
    }
    public void getValue(int index){
        try{
            out.println(arr[index]);
        }catch(ArrayIndexOutOfBoundsException err){
            out.println("Invalid index!!!");
        }
    }
    public void search(int value){
        for (int j : arr) {
            if (j == value) {
                out.println("Value found");
                return;
            }
        }
        out.println("Value doesn't found");
    }
    public void delete(int index){
        try{
            arr[index] = Integer.MIN_VALUE;
        }
        catch(ArrayIndexOutOfBoundsException obj){
            out.println("Invalid index");
        }
    }

}
public class Implementation {
    public static void main(String[] args) {
        ArrayImplementation obj = new ArrayImplementation(3);
        obj.insert(0,15);
        obj.insert(1,20);
        obj.insert(2,25);
        obj.delete(1);
        obj.getValue(2);

    }
}
