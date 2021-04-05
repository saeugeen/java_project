package com.ict01.grammar03;
import java.util.Scanner;

class Ex07{
	public static void main(String[] args){
	//Scanner 클래스 알아보기
	//Scanner의 소속은 java.util.Scanner이다.
	//java.lang의 소속된 클래스 마음대로 사용했지만 이 외의 
	//클래스는 소속을 표시해야 된다.(import)

	// 클래스 안에는 comstructor(생성자), method(메소드), Field(필드)
	//메소드 -->동작, 기능,하는 것


	//키보드에 입력된 내용이 scan에 저장된다.
	Scanner scan = new Scanner(System.in);
	System.out.print("당신의 이름 : " );
	String name = scan.next();

	System.out.print("국어 점수 : " );
	int kor= scan.nextInt();

	System.out.print("영어 점수 : " );
	int eng= scan.nextInt();

	System.out.print("수학 점수 : " );
	int math= scan.nextInt();
	
	int sum = kor + eng + math; 
	System.out.println("총점 :" + sum);
	
	//들어온 정보를 double 형으로 만들기
	System.out.print("당신의 키: ");
	double height = scan.nextDouble();
	System.out.println(height);

	//들어온 정보를 boolean형으로 만들기
	System.out.print("당신의 남자입니까?(True/False)");
	boolean gender =scan.nextBoolean();
	String str = gender ? "남성" : "여성" ;
	System.out.println(str);
	}
}