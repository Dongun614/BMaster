package JAVA;

import java.io.*;
import java.util.*;

public class B2420_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        System.out.println(Math.abs(n-m));
    }
}

//throw IOException은 왜 해야 하는가
//Long.parseLong은 뭔지