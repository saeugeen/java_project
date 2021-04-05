package com.ict01.grammar03;
import java.util.Scanner;

class Ex08{
	public static void main(String[] args){
	//숫자를 받아서 홀수, 짝수를 구분하자
	Scanner sc = new Scanner(System.in);

	System.out.println("숫자를 입력하세요");
	int i =sc.nextInt();
	
	String res1 = (i%2==0)?"짝수":"홀수";
	System.out.println("결과 :" +res1);

	System.out.println("국어점수를 입력하세요");
	int kor = sc.nextInt();
	System.out.println("영어점수를 입력하세요");
	int eng = sc.nextInt();
	System.out.println("수학점수를 입력하세요");
	int math = sc.nextInt();
	
	//int aveg = (kor + eng+ math)/3;
	int sum = kor + eng+math;
	double aveg = (int)(sum/3.0*10) /10.0;
	String res2 = (aveg >=60) ? 
		(kor>=40 && eng>=40 && math>=40 ) ? "합격":"불합격" : ("불합격" ) ;
	System.out.println("결과2 :" +res2);

	
	System.out.println("알바시간을 입력하세요:");
	int hour =sc.nextInt();
	int pay =8720;
	double result3 = (hour>8) ? (pay*8)+((hour-8)*pay*1.5) : 8720*hour; 
	System.out.println("결과3  :  " + (int)(result3));

	}
}