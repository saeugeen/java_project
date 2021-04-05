package com.ict01.grammar03;
class Ex05{
	public static void main(String[] args){
	int k1 =65;
	String result = (k1>=60) ? "합격" : "불합격";
	System.out.println("결과1" + result);
	//int k1가 60이상이면 합격 아니면 불합격

	
	int k2 =3;
	String result2 = (k2%2 == 0) ? "짝수" : "홀수";
	System.out.println("결과2  :" + result2);
	// int k2이 홀수 인지 짝수인지 판별하자

	int k3 = 'c';
	String res3 = (k3 >='A' && k3<= 'Z') ? "대문자" : "대문자가 아니다";	
	System.out.println("결과2  :" + res3);
		
	int hour =10;
	int pay=8720;
	double result3 = (hour>8) ? (pay*8)+((hour-8)*pay*1.5) : 8720*hour; 
	System.out.println("결과3  :  " + (int)(result3));
	//근무시간이 8시간까지는 시간당 8720이고
	//8시간을 초과한 시간만큼은 1.5배이다.
	//현재 근문시간이 10시간이다.
	//얼마를 받아야하나
	}
}