package com.ict01.grammar03;
import java.util.Scanner;

class Ex11{
	public static void main(String[] args){
	// 다중 if문 : 조건식이 거짓일때 다시 조건식을 사용한다. 
	// if (조건식 1){
	//	조건식1이 참일때 실행;
	//	}else if(조건식2){
	//	조건식1은 거짓이면서 조건식2는 참일때 실행;
	//	}else if(조건식3){
	//	조건식1,2은 거짓이면서 조건식3는 참일때 실행;
	//	}else{
	//	조건식 1,2,3 모두 거짓일때, 나머지인 경우
	//	}
	
	int k1 = 88;
	String str1="";
	if(k1>=90){
		str1 ="A";
	}else if(k1>=80){
		str1="B";
	}else if(k1>=70){
		str1="C";
	}else{
		str1="F";
	}
	System.out.println(str1);	




	char k2 ='A';
	String str2="";
	if(k2>='A' && k2<='Z'){
		str2 ="대문잔";
	}else if(k2>='a' && k2<='z'){
		str2="소문자";
	}else if(k2>='0' && k2<='9'){
		str2="숫자";
	}else{
		str2="기타문자";
	}
	System.out.println(str2);
	
	


	int k3 = 'A';
	String str3="";
	if(k3>='A' && k3<='a' ){
		str3 ="아프리카";
	}else if(k3>='B' && k3<='b' ){
		str3 ="브라질";
	}else if(k3>='C' && k3<='c' ){
		str3 ="캐나다";
	}else{
		str3="한국";
	}
	System.out.println(str3);	



		

	Scanner sc = new Scanner(System.in);

	System.out.println("번호를 입력하세요.");
	int menu = sc.nextInt();
	int moka =3500;
	int latte = 4000;
	int ame = 3000;
	int fruit = 3500;
	int pay=0;
	
	if(menu==1){
		pay = 10000 - moka*2 - (int)(moka*2*0.10);
	}else if(menu==2){
		pay = 10000 -latte*2 - (int)(latte*2*0.10);
	}else if(menu==3){
		pay = 10000 - ame*2 - (int)(ame*2*0.10);
	}else if(menu==4){
		pay = 10000 - fruit*2 - (int)(fruit*2*0.10);
	}else{
		System.out.println("error");
	}
	System.out.println(pay);

	
	}
}