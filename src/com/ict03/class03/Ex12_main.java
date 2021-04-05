package com.ict03.class03;

import java.util.Scanner;

public class Ex12_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("선택하세요(1. 고양이 2.강아지) >>  ");
		int s1 = scan.nextInt();
		
		if(s1 == 1) {
			Ex10_Cat cat = new Ex10_Cat();
			cat.sound();
			cat.hobby();
			cat.like();
			cat.sleep();
		}else if(s1 == 2) {
			Ex11_dog dog = new Ex11_dog();
			dog.sound();
			dog.hobby();
			dog.like();
			dog.sleep();
		}
	}
}
