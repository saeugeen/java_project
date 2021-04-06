package com.ict03.class02;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int com[] = new int[3];
		int my[] = new int[3];

		int time = 10;
		
		for (int i = 0; i < 3; i++) {
			com[i] = (int) (Math.random() * 10) + 1;
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {
					i--;
					break;
				}
			}
		}

		while (time > 0) {
			int strike = 0;
			int ball = 0;
			System.out.print("숫자를 입력하세요");
			for (int i = 0; i < 3; i++) {
				my[i] = sc.nextInt();
			}
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (com[i] == my[j]) {
						if (i == j) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
			if (strike == 3) {
				System.out.println("이겼습니다.");
				break;
			} else {
				time--;
				if (time == 0) {
					System.out.println("기회 끝남");

				} else {
					System.out.println(strike + "스트라이크" + ball + "볼");
				}
			}
		}
		

	}
}
