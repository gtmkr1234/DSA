package Codechef;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int clr(int r, int g, int b){
        int count = 0;
        if(r>1 && g>1){
            count++;
            r--;
            g--;
        }
        if(r>1 && b>1){
            count++;
            r--;
            b--;
        }
        if(b>1 && g>1){
            count++;
            b--;
            g--;
        }
        if(r>=1){
            count++;
        }
        if(g>=1){
            count++;
        }
        if(b>=1){
            count++;
        }

        return count;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int r = s.nextInt();
            int g = s.nextInt();
            int b = s.nextInt();
            System.out.println(clr(r,g,b));
        }
    }
}