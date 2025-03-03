//(1 ≤ m ≤ n ≤ 101000, m과 n은 10진수 정수) 유효값 체크하기
//

import java.util.Scanner;

public class B1217{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int asset; //최백준 조교가 가진 돈 n
        int member; //나눠줘야할 인원 수 m
        //int rest; //나눠주고 남은 값

        asset = input.nextInt();
        member = input.nextInt();

//        if(asset % member < 1){ //만약 n/m 후 남은 값이 1 미만이라면 해당 값을 출력, 아니면 0을 출력
//            rest = asset % member;
//        }
//        else{
//            rest = 0;
//        }

        //테스트 코드
        //System.out.println("asset = " + asset + "\n" + "member = " + member + "\n");
        System.out.println(asset/member + "\n" + asset%member);
        System.exit(0);
    }
}