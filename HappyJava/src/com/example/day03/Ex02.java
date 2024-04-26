package com.example.day03;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        //실습 문제 2: 짝수와 홀수 판별기
        //사용자로부터 정수 하나를 입력받아, 그 수가 짝수인지 홀수인지 판별하는 프로그램을 작성하세요. if-else 문을 사용하여 구현하세요.
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 하나를 입력해주세요. : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
    }
}
