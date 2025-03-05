//입력: 첫째 줄에 두 도메인의 유명도 N과 M이 주어진다. (-2,000,000,000 ≤ N, M ≤ 2,000,000,000)
//출력: 첫째 줄에 두 유명도의 차이 (|N-M|)을 출력한다.
//1. 두 수를 입력받는다.
//1.1 두 수의 유효 여부를 확인한다.
//2. (|N-M|)을 출력한다.

package JAVA;

import java.util.Scanner;

public class B2420 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n; //첫번째로 입력받는 수
        int m; //두번째로 입력받는 수
        boolean validN = true; //n이 유효한 값인지 확인한는 boolean
        boolean validM = true; //m이 유효한 값인지 확인한는 boolean

        n = input.nextInt();
        m = input.nextInt();

        //유효한지 확인하는 코드
        if(n < -2000000000) validN = false;
        if(m > 2000000000) validM = false;
        if(!(validN&&validM)) System.exit(0);

        System.out.println(Math.abs(n-m));
    }
}

//맞다는 코드, 뭐가 다른지 나중에 살피기
//import java.io.*;
//        import java.util.*;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        //n과 m 입력받기
//        long n = Long.parseLong(st.nextToken());
//        long m = Long.parseLong(st.nextToken());
//        System.out.print(Math.abs(n-m));  //n - m을 절대값을 한 값을 출력하면 된다
//    }
//}