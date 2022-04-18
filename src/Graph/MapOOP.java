package Graph;

import java.util.HashMap;
import java.util.Scanner;

public class MapOOP {
    public static void main(String[] args) {
        Map o1 = new Map();
        o1.insert();
        o1.insert();
        o1.out();

    }
}
class Map{
    HashMap<String, Integer> obj;
    public Map(){
        obj = new HashMap<>();
    }
    public void insert(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the key :");
        String key = s.nextLine();
        System.out.println("Enter the corresponding value:");
        Integer value = s.nextInt();
        obj.put(key,value);
    }
    public void out(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the key :");
        String str = s.nextLine();
        int res = obj.get(str);
        System.out.println(res);
    }
}
