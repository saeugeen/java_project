package com.ict04.exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// ���� catch�� : try���� ���� �߻��� ���� ������ ���ܰ� �߻��� ��� ���
		// ���� ���� : Exception�� ����Ҷ��� �ݵ�� �Ʒ��� catch������ ����Ѵ�.
		Scanner scan = new Scanner(System.in);
		try {
			int var =3;
			System.out.println("������ �Է�: ");
			int su = scan.nextInt();
			System.out.println("���� : " + (su/var));			
		} catch (InputMismatchException e) {
			System.out.println("������ �Է��ϼ���");
		} catch (ArithmeticException e) {
			System.out.println("0���δ� ���ڸ� ���� �� �����ϴ�.");
		}
		System.out.println("�����ϼ̽��ϴ�.");
	}
}
