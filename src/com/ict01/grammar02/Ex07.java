package com.ict01.grammar02;
class Ex07{
	public static void main(String[] args){
	//이름이 홍길동인 사람의 국어 :90, 영어:80, 수학 :90이다
	//총점과 평균을 구해서 이름, 총점,평균을 출력하자
	int a =90;
	int b = 80;
	int c = 90;
	String name =" 홍길동";
	
	int total = a+b+c;
	double average = total/3.0;
	double average2 =(int)(average*10) /10.0;
	
	System.out.println("이름 :" + "총점 : "+total + "평균 :"+ average2);

	

	}
}