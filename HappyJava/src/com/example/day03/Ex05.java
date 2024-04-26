package com.example.day03;

import java.util.Random;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        //실습 문제 5: 숫자 맞추기 게임
        //프로그램이 1부터 100 사이의 임의의 숫자를 선택하고, 사용자가 그 숫자를 맞추도록 하는 게임을 만드세요. 사용자가 숫자를 입력할 때마다, 프로그램은 사용자의 입력이 정답보다 큰지, 작은지, 또는 정답인지를 알려주어야 합니다. 사용자가 정답을 맞출 때까지 이 과정을 반복하세요. while 루프와 if-else 문을 사용하여 구현하세요.

        Random random = new Random();
        int ranNum = random.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1부터 100까지 숫자를 선택하세요. : ");
            int num = sc.nextInt();

            if (num == ranNum) {
                System.out.println("정답입니다!");
                break;
            } else if (num < ranNum) {
                System.out.println("정답보다 더 큽니다.");
            } else {
                System.out.println("정답보다 더 작습니다.");
            }
        }
    }
}
