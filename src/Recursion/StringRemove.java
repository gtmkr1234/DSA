package Recursion;

public class StringRemove {
    public static String remove(String str){
        if(str.length()==0){
            return str;
        }
        String res = "";
        if(str.charAt(0)=='a'){
            res = res + str.charAt(0);
        }
        String recans = remove(str.substring(1));
        return res + recans;
    }

    public static void main(String[] args) {
        System.out.println(remove("abcdafa"));
    }
}
