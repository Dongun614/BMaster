package JAVA;//두 정수 A,B가 주어졌을 때 A와 B를 비교하는 프로그램
//1. A와 B를 입력받는다
//1.1 유효값을 확인한다 -10,000 <= A,B <= 10,000
//2. A>B인 경우에는 '>' 출력
//3. A<B인 경우에는 '<' 출력
//4. A=B인 경우에는 '==' 출력

import java.util.Scanner;

public class B1330 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int A;
        int B;
        boolean validA = true; //boolean initialize 반드시 하기
        boolean validB = true;

        A = input.nextInt();
        B = input.nextInt();

        if(A <= -10000 || A >= 10000) validA = false;
        if(B <= -10000 || B >= 10000) validB = false;

        //유효값 확인하는 코드
        if(!(validA&&validB)){
            System.exit(0);
        }

        if(A>B){
            System.out.println(">");
        }else if(A<B){
            System.out.println("<");
        }else System.out.println("==");

    }
}
