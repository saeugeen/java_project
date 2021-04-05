package com.ict01.grammar03;
class Ex10{
	public static void main(String[] args){
	// if ~else ~: 조건식이 참일떄와 거짓일때 각각 나눠서 처리한다.
	// 형식 : if (조건식) {
	//		조건식이 참일때 실행할 문장;
	//		조건식이 참일때 실행할 문장;
	//	}else{
	//		조건식이 거짓일때 실행할 문장;
	//		조건식이 거짓일때 실행할 문장;
	//	}
	//	단 , 실행할 문장이 한 줄이면 생략 가능하다.

	int k1=70;
	String res=" ";
	if(k1>=60){
		res ="합격";
	}else{
		res="불합격";
	}
	System.out.println(res);



	int k2=2;
	String res2=" ";
	if(k2%2==0){
		res2="짝수";
	}else{
		res2="홀수";
	}
	System.out.println(res2);

	
	char k3 = 'c';
	String res3 = " ";
	if(k3>='A' && k3<='Z'){
		res3="대문자";
	}else{
		res3="소문자";
	}
	System.out.println(res3);
	

	

	int pay=8720;
	int hour =10;
	int res4 = 0;
	if(hour>8){
		res4=pay*8 + (int)(pay*1.5*(hour-8));
	}else{
		res4=pay*hour;
	}
	System.out.println(res4);
	
	}
}