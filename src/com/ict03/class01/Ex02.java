package com.ict03.class01;

public class Ex02 {
	// 클래스 안에는 3가지가 존재
	// 멤버필드, 멤버메소드 , 생성자
	// 멤버필드 : 상수와 변수 , static과 instance로 나눠진다.
	
	int k1 = 80;		    	// 인스턴스 변수 == 일반 변수
	static int k2 = 90;			// static 변수
	final int k3 = 85;			// 인스턴스 상수 
	static final int k4 = 95;	// static 상수 = API에서 제공하는 상수형태
	
	// final 존재하면 상수
	// static 없으면 인스턴스(객체 생성할때 같이 만들어진다.)
	// static이란 객체 생성과 상관없이 미리 만들어진다.
	
	//멤버 메소드 : 동작이나 기능
	//메소드는 자기를 호출한 곳으로 되돌아 간다.
	//인스턴스 , 반환형이 없다. ( 보낼 데이터가 없다 )
	public void prn01() {
		k1 = k1 + 20;
		k2 = k2 + 10;
		System.out.println("k1= " +k1);
		System.out.println("k2= " +k2);
		// final이 붙으면 상수이다. 상수는 값 변경이 불가 // 오류 발생
		// k3 = k3 + 15;
		// k4 = k4 + 5 ;
		
		// 지역 변수 : 메소드 안에서 만들어진 변수
		// 			   메소드 안에서 만들어진 변수는 메소드를 호출할때 생성 된다.
		//			   메소드가 끝나면 사라진다.
		//			   instance지역변수는 static을 만들 수 없다.
		
		int s1 = 10;
		//static int s2 = 90;			
		final int k3 = 85;			
		//static final int s4 = 95;
		
	}
	
	//static , 반환형이 없다.
	public static void prn02() {
		//static 메소드에는 인스턴스 변수를 사용할수 없다.
		//k1 = k1 + 20;
		k2 = k2 + 10;
		//k3 = k3 + 15;
		//k4 = k4 + 5 ;
		System.out.println("k2= "+k2);
		
		//지역변수는 static 을 만들 수 없다.
		int s1 = 10;
		//static int s2 = 90;			
		final int k3 = 85;			
		//static final int s4 = 95;
		
	}
	//인스턴스 , 반환형이 있음, 마지막 줄 return '보낼 데이터'
	public int prn03() {
		return 'c';		//반환형보다 작은 자료형
		//return 14;    //반환형이랑 같은 자료형 
	}
	//static, 반환형이 있음
	public static double prn04() {
		return 147;
		//return 3.14;
	}
}
