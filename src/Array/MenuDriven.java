package Array;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class MenuDriven {
    private int [] arr;

    public MenuDriven(){
        Scanner sc = new Scanner(in);
        out.println("Enter the size of the array ");
        int n = sc.nextInt();
        arr = new int[n];
        Arrays.fill(arr,0);
    }
    public void traverse(){
        for(int j: arr){
            out.println(j);
        }
    }
    public void getValue(int index){
        try{
            out.println(arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            out.println("Invalid Index");
        }
    }
    
}
