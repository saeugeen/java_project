package com.ict01.grammar03;
class Ex01{
	public static void main(String[] args){
	//논리 연산자 : &&(AND, 논리곱), || (OR, 논리합), !(NOT, 논리부정)
	// 사용되는 자원 : boolean형, 비교연산, 논리연산
	// 결과는 boolean형 --> 조건식에 사용된다.
	
	// && (AND, 논리곱, 교집합)
	// - 주어진 조건이 모두 true 일때만 결과가 true
	// - 주어진 조건들 중에 false를 만나는 순간 결과 = false
	// - false를 만나면 이후에 있는 연산은 하지 않는다.

	int s1 =10;
	int s2 = 7;
	boolean result = true && true;
	System.out.println(result);

	result = (s1>=7) && (s2 >=5);
	System.out.println(result); 

	//false 만나면 이후 연산하지 않는다.
	result = ((s1=s1+2)>s2) && (s1 ==(s2=s2+5));
	System.out.println("결과 :" + result); 
	System.out.println("s1:"+s1); 
	System.out.println("s2:"+s2); 

	//앞에 값이 false이기 때문에 뒤에는 굳이 하지 않는다.
	result = ((s1=s1+2)<s2) && (s1 ==(s2=s2+5));
	System.out.println("결과 :" + result); 
	System.out.println("s1:"+s1); 
	System.out.println("s2:"+s2); 
	
	//&&는 숫자일 경우 범위 지정할 수 있다.
	// a >= 10 && a<=20;	a는 10부터 20까지의 범위를 의미한다.
	s1 = 24;
	result = (s1>=20) && (s1<=30);
	System.out.println(result);
		
	// char c1 이 소문자 이냐 ?
	char c1 = 'D';
	result = (c1>=97) && (c1<=122);
	System.out.println(result);
	}  
}