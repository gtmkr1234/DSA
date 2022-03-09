package HackerRank;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class QueueQ1 {
    static void firstnonrep(String str){
        int [] charCount = new int[26];
        Queue <Character> q = new LinkedList<Character>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            charCount[ch - 'a']++; // adds frequency of char count to the index
            while(!q.isEmpty()){
                if(charCount[q.peek()- 'a'] > 1){
                    q.remove();
                }
                else{
                    System.out.print(q.peek() +  " ");
                    break;
                }
                if(q.isEmpty()){
                    System.out.print(-1 + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        firstnonrep(s);
    }
}
