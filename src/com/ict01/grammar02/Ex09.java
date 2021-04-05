package com.ict01.grammar02;
class Ex09{
	public static void main(String[] args){
		int sec =1;
		int min =sec*60;
		int hour = min*60;
	System.out.println(2*hour + 40*min +23*sec +"초입니다");

	int x=9630;
	int a =x/3600;
	int b = (x%3600)/60;
	int c = (x%3600)%60;
	System.out.println("9630초는"+a+"시간" +b+"분"+c+"초 입니다");
	}
}