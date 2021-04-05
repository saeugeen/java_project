package com.ict03.class01;

import java.util.Scanner;

public class Ex10_main {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 명 인가요?");
		int su = scan.nextInt();
		
		Ex10[] offer = new Ex10[su];
		for (int i = 0; i < offer.length; i++) {
			System.out.print("이름: ");
			String name = scan.next();
			System.out.println("1.모카\t 2.아메\t 3.라떼\t 4.자몽");
			System.out.print(i+"번 손님은 무엇??");
			int menu = scan.nextInt();
			
			Ex10 product = new Ex10();
			
				if(menu==1) {
					product.setName("모카");
					product.setPrice(2500);
				}else if(menu==2) {
					product.setName("아메");
					product.setPrice(3300);
				}else if(menu==3) {
					product.setName("라떼");
					product.setPrice(3000);
				}else if(menu==4) {
					product.setName("자몽");
					product.setPrice(3500);
				}else {
					System.out.println("오류");
				}
				offer[i] = product;
						
		}
		
		//전체 금액
		int sum = 0;
		for (int i = 0; i < offer.length; i++) {
			sum = sum + offer[i].getPrice();
			
		}
		System.out.println("총 액 : "+ sum);
		System.out.println("입금액 :" );
		int input = scan.nextInt();
		System.out.println("잔액: "+(input-sum));
	}

}
