package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class eqUALizeab {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static String fun(long a, long b, long x){
        if(a==b)
            return "YES";
        if(a>b)
            return "NO";
        while(a<b){
            a+=x;
            b-=x;
            if (a==b)
                return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        FastReader s = new FastReader();
        int n = s.nextInt();
        while(n>0){
            long a = s.nextLong();
            long b = s.nextLong();
            long x = s.nextLong();
            System.out.println(fun(a,b,x));
            n--;
        }
    }

}
