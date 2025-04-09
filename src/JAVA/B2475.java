package JAVA;
//1. 5개의 입력값 받기
//2. 5개의 입력값을 각각 제곱하여 더한 값 / 10을 출력하기

import java.util.Scanner;

public class B2475 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] input = new int[5];
        int squareSum = 0;
        int result;

        for(int i=0; i<input.length; i++){
            input[i] = sc.nextInt();
        }

        for(int i=0; i<input.length; i++){
            squareSum += Math.pow(input[i], 2);
        }

        result = squareSum % 10;

        System.out.println(result);

    }
}
