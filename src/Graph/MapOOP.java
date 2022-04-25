package Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class MapOOP {
    public static void main(String[] args) {
        Mapo o1 = new Mapo();
        o1.insert();
        o1.insert();
        o1.out();
        o1.display();

    }
}
class Mapo{
    HashMap<String, Integer> obj;
    public Mapo(){
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
    public void display(){
        for(Map.Entry<String, Integer> res : obj.entrySet()){
            System.out.println(res.getKey());
            System.out.println(res.getValue());
        }
    }
}
