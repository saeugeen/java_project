package com.ict03.class01;

public class Ex11_main {
	public static void main(String[] args) {
		// Ex11 기본생성자가 아닌 다른 생성자가 있음
		// 그러므로 다른 생성자로 객체 생성을 해야한다.
		 Ex11 test1 = new Ex11("임꺽정", 17);
		
		// Ex11 test1 = new Ex11();
		 
		System.out.println(test1.getName());
		System.out.println(test1.getAge());
		System.out.println(test1.isGender());
		
		/*
		Ex11 test2 = new Ex11();
		System.out.println(test2.getName());
		System.out.println(test2.getAge());
		System.out.println(test2.isGender());
		
		//setter를 이용해서 멤버필드의 값을 변경할수 있다.
		test2.setName("일지매");
		System.out.println(test2.getName());
		System.out.println(test2.getAge());
		System.out.println(test2.isGender());
		*/
		
	}
}
