package Array.Implementation;

import java.util.Scanner;
import static java.lang.System.*;

public class MenuDriven {
    private int [] arr;

    public MenuDriven(){
        Scanner sc = new Scanner(in);
        out.println("Enter the size of the array ");
        int n = sc.nextInt();
        arr = new int[n];
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
    public void add(int element){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        MenuDriven obj = new MenuDriven();

    }
}
