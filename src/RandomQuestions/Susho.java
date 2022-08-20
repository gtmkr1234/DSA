package RandomQuestions;

import java.util.Arrays;

public class Susho {
    public static void main(String[] args) {
        String a = "1234";
        char []arr= a.toCharArray();
        int [] sus = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sus[i] = arr[i] - '0';
        }
        System.out.println(Arrays.toString(sus));
    }
}
