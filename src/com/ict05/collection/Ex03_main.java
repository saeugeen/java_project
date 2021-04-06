package com.ict05.collection;

import java.util.HashSet;
import java.util.Iterator;


public class Ex03_main {
	public static void main(String[] args) {
		Ex03 coffee = new Ex03();
		// setter를 이용해서 이름과 값을 정함
		coffee.setName("커피음료");
		coffee.setPrice(2500);
		
		//생성자를 이용해서 이름과 값을 정함
		Ex03 cola = new Ex03("콜라" , 1600);
		Ex03 juice = new Ex03("과일음료",2000);
		
		//객체들을 저장하고 관리하는 방법 : 배열 , 컬렉션
		Ex03[] arr = new Ex03[3];
		arr[0] = coffee;
		arr[1] = cola;
		arr[2] = juice;
		
		//이름과 가격 꺼내기
		for (Ex03 k : arr) {
			System.out.println("이름: " + k.getName());
			System.out.println("가격: " + k.getPrice());
		}
		System.out.println("==============");
		
		//2.컬렉션
		HashSet<Ex03> h1 = new HashSet<>();
		// 추가
		h1.add(coffee);
		h1.add(cola);
		h1.add(juice);
		//더 추가할 수 있다.(배열은 못함)
		h1.add(new Ex03("ion",1500));
		
		//이름과 가격 꺼내기
		//1.개선된 for문 사용
		for (Ex03 k : h1) {
			System.out.println("이름: " + k.getName());
			System.out.println("가격: " + k.getPrice());
		}
		System.out.println("==============");
		
		//2.iterator()사용
		Iterator<Ex03> it = h1.iterator();
		while(it.hasNext()) {
			Ex03 s1 = (Ex03) it.next();
			System.out.println("이름: " + s1.getName());
			System.out.println("가격: " + s1.getPrice());
		}
		System.out.println("==============");
		
		//포함여부 : contains
		if(h1.contains(coffee)) {
			System.out.println("있다");
		}else {
			System.out.println("없다");
		}
		
	}
}
