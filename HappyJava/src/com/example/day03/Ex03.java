package com.example.day03;

public class Ex03 {
    public static void main(String[] args) {
        //실습 문제 3: 구구단 출력기
        //while 루프를 사용하여 2단부터 9단까지의 구구단을 출력하는 프로그램을 작성하세요. 각 단은 한 줄에 하나씩 출력되어야 합니다.

        int i = 1;
        while (i++ < 9) {
            int j = 0;
            while (j++ < 9) {
                System.out.println(i + "*" + j + "=" + i*j);
            }
        }
    }
}
