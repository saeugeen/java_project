package com.ict01.grammar02;
class Ex11{
	public static void main(String[] args){
	//비교연산자 : 변수나 상수의 값을 비교할때 사용
	//	      결과는 항상 boolean이다.
	// 	      boolean 형은 조건식에 사용된다.
	//	      자료형이 String인 경우에는 사용하지 말자.
	int s1 = 90;
	int s2 = 80;
	boolean res = s1>=s2;

	System.out.println("결과:"+res);

	char s3 = 'c';
	char s4 =	 'a';
	res =s3 >=s4;

	System.out.println("결과:"+res);
	
	//char 과 int 비교
	res = 'a' ==97;
	System.out.println("결과:"+res);

	//int  와 double 비교
	res = 97 >=97.0000001;
	System.out.println("결과:"+res);
	
	//오류 발생
	System.out.println();
	String str1 = "대한민국";
	String str2 = "대한민국";
	//res = str1>str2;
	//System.out.println("결과:"+res);
	//res = str1>=str2;
	//System.out.println("결과:"+res);


	//결과는 참으로 나오지만 주소값이 다르다
	//String 은 별도로 존재
	res = str1==str2;
	System.out.println("결과:"+res);
	
	}
}