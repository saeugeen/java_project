package com.ict03.class01;

import java.util.Scanner;

public class Ex10_main {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �� �ΰ���?");
		int su = scan.nextInt();
		
		Ex10[] offer = new Ex10[su];
		for (int i = 0; i < offer.length; i++) {
			System.out.print("�̸�: ");
			String name = scan.next();
			System.out.println("1.��ī\t 2.�Ƹ�\t 3.��\t 4.�ڸ�");
			System.out.print(i+"�� �մ��� ����??");
			int menu = scan.nextInt();
			
			Ex10 product = new Ex10();
			
				if(menu==1) {
					product.setName("��ī");
					product.setPrice(2500);
				}else if(menu==2) {
					product.setName("�Ƹ�");
					product.setPrice(3300);
				}else if(menu==3) {
					product.setName("��");
					product.setPrice(3000);
				}else if(menu==4) {
					product.setName("�ڸ�");
					product.setPrice(3500);
				}else {
					System.out.println("����");
				}
				offer[i] = product;
						
		}
		
		//��ü �ݾ�
		int sum = 0;
		for (int i = 0; i < offer.length; i++) {
			sum = sum + offer[i].getPrice();
			
		}
		System.out.println("�� �� : "+ sum);
		System.out.println("�Աݾ� :" );
		int input = scan.nextInt();
		System.out.println("�ܾ�: "+(input-sum));
	}

}
