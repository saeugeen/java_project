package com.ict02.array;

import java.util.Arrays;
import java.util.Collections;

public class Ex03 {
	public static void main(String[] args) {
		// �迭 �����ϱ�
		int tmp = 0; //�ڸ������� ���� ����
		int[] su = { 3, 4, 9, 5, 6, 1, 7, 2, 10, 8 };
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su.length; j++) {
				// ��(i)���� ��(j)�� ������ �ڸ� ����(��������)
				// ��(i)���� ��(j)�� ũ�� �ڸ� ����(��������)
				if (su[i] > su[j]) {
					tmp = su[i];
					su[i] = su[j];
					su[j] = tmp;
				}
			}
		}
		for (int j = 0; j < su.length; j++) {
			System.out.println(su[j]);
		}
		System.out.println("==============");
		
		//Arrays.sort(�迭) �޼ҵ�� �ش� �迭�� ���������ϴ� ���
		int[] su2 = {3,4,9,5,6,1,7,2,10,8};
		Arrays.sort(su2);
		
		for (int i = 0; i < su2.length; i++) {
			System.out.println(su2[i]);
		}
		
		System.out.println("==============");
		//Integer[] ���߿� ���
		//Ŭ������ �ڷ��� �迭�� ���( �����ڷ��� �迭 �϶� �������� ���� )
		Integer[] su3 = {3,4,9,5,6,1,7,2,10,8};
		
		//Arrays.sort(�迭, Collections.reversOrder())
		Arrays.sort(su3, Collections.reverseOrder());
		
		for (int i = 0; i < su3.length; i++) {
			System.out.println(su3[i]);
		}
		
		System.out.println("==============");
		
		
	}
}
