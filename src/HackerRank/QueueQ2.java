package HackerRank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class QueueQ2 {
    static Queue<Integer> Q2;
    static void reversek(int k){
        Stack<Integer> stk = new Stack<Integer>();
        for (int i = 0; i < k; i++) {
            stk.push(Q2.peek());
            Q2.remove();
        }
        while(!stk.isEmpty()){
            Q2.add(stk.pop());
        }
        for (int i = 0; i < Q2.size()-k; i++) {
            Q2.add(Q2.peek());
            Q2.remove();
        }
    }
    static void Print(){
        while(!Q2.isEmpty()){
            System.out.print(Q2.peek() + " ");
            Q2.remove();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Q2 = new LinkedList<>();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            Q2.add(arr[i]);
        }
        reversek(k);
        Print();
    }
}
