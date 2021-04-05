package com.ict02.array;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[5];
		int[] math = new int[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] rank = { 1,1,1,1,1 };
		
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hak = new String[5];
		
		//입력
		for (int i = 0; i < 5; i++) {
			System.out.print("이름을 입력하세요");
			 name[i] = sc.next();
			
			System.out.print("수학 점수을 입력하세요");
			 math[i] = sc.nextInt();
			
			System.out.print("국어 점수을 입력하세요");
			 kor[i] = sc.nextInt();
			
			System.out.print("영어 점수을 입력하세요");
			 eng[i] = sc.nextInt();
		}
		
		//가공 : 처리 // 총점, 평균, 학점
		
		for (int i = 0; i < hak.length; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int)(sum[i]/3.0*10)/10.0;
			if(avg[i]>=90) {
				hak[i] = "A";
			}else if(avg[i]>=80) {
				hak[i] = "B";	
			}else if(avg[i]>=70) {
				hak[i] = "C";	
			}else {
				hak[i] = "F";	
			}
		}
		
		// 순위를 구하자
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				if(sum[i]<sum[j]) {
					rank[i]++;
				}
			}
		}
		
		//출력( 자바 이스케이프 문자 : \t(탭), \n(줄바꾸기)
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위" );
		for (int i = 0; i < hak.length; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.print(hak[i]+"\t");
			System.out.println(rank[i]);
		}
		
	}
}
