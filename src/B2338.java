//문제: 두 수 A, B를 입력받아, A+B, A-B, A×B를 구하는 프로그램을 작성하시오.
//입력: 첫째 줄에 A가, 둘째 줄에 B가 주어진다. 각각의 수는 10진수로 1,000자리를 넘지 않으며 양수와 음수가 모두 주어질 수 있다.
//출력: 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A×B를 출력한다.
//     각각을 출력할 때, 답이 0인 경우를 제외하고는 0으로 시작하게 해서는 안 된다(1을 01로 출력하면 안 된다는 의미).

//1. 두 수를 입력받는다.
//1.1 받은 값의 유효값을 확인한다.
//2. 첫째줄에 A+B, 둘째줄에 A-B, 셋째줄에 A*B를 출력한다.

import java.util.Scanner;

public class B2338 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a; //A값
        int b; //B값
        boolean validA = true; //A값이 유효한지
        boolean validB = true; //B값이 유효한지

        a = input.nextInt();
        b = input.nextInt();

        //유효값 확인 코드
        if(String.valueOf(a).length() > 1000) validA = false;
        if(String.valueOf(b).length() > 1000) validB = false;

        if(!(validA&&validB)){
            System.exit(0);
        }

        //출력
        System.out.println((a+b) + "\n" + (a-b) + "\n" + (a*b));
    }
}