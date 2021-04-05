package com.ict03.class02;

import java.util.Random;
import java.util.Scanner;

public class Ex04_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ball = 0;
		int strike =0;
		
		System.out.println("숫자 세개를 입력:");
		int[] number = new int[3];
		int[] answer = new int[3];

		for (int i = 0; i < 3; i++) {
			answer[3] = sc.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			number[3] = (int)(Math.random()*9+1);
		}
		
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer.length; j++) {
				if(number[i]==answer[j]) {
					strike +=1;
				}else if(number[i]!=answer[j]) {
					//if()
				}
			}
		}
		
		
		
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer.length; j++) {
				while(answer[i] == number[j]) {
					System.out.println("게임 종료!");
				}
			}
		}
		
	}
}
