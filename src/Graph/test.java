package Graph;
import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        HashMap <String,Integer> obj = new HashMap<>();
        obj.put("ABC",50);
        obj.put("DEF", 56);
        int a = obj.get("ABC");
        System.out.println(a);
        int b = obj.getOrDefault("DEF",-1);
        System.out.println(b);
        System.out.println(obj);
        //Key can not be duplicated but values can be
    }
}
