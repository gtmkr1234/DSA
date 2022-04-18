package Graph;
import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        HashMap <String,Integer> obj = new HashMap<>();
        obj.put("ABC",50);
        obj.put("DEF", 56);
        obj.put("IJK",45);
        for(Map.Entry<String,Integer> res : obj.entrySet()){
            System.out.println(res.getKey());
            System.out.println(res.getValue());
            System.out.println(res.getClass());
        }
        //Key can not be duplicated but values can be
    }
}
