package com.ict02.array;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ��ȣ, ����, ���� , ���������� �Է¹޾Ƽ�
		// ��ȣ, ����, ��� , ����, ������ ���ϰ� ��������

		int[][] arr = new int[5][5];

//		int[] num = new int[5];
//		int[] math = new int[5];
//		int[] kor = new int[5];
//		int[] eng = new int[5];
//		int[] rank = { 1, 1, 1, 1, 1 };
//
//		int[] sum = new int[5];
//		double[] avg = new double[5];
//		String[] hak = new String[5];
//
//		arr[0] = num;
//		arr[1] = math;
//		arr[2] = kor;
//		arr[3] = eng;
//		arr[4] = rank;

		// �Է�
		for (int i = 0; i < arr.length; i++) {
			System.out.print("��ȣ�� �Է��ϼ���");
			int num = sc.nextInt();

			System.out.print("���� ������ �Է��ϼ���");
			int math = sc.nextInt();

			System.out.print("���� ������ �Է��ϼ���");
			int kor = sc.nextInt();

			System.out.print("���� ������ �Է��ϼ���");
			int eng = sc.nextInt();
			
			int sum = kor + eng + math;
			int avg = sum /3;
			int hak = 0;
			
			if(avg>=90) {
				hak = 'A';
			}else if(avg >=80) {
				hak ='B';
			}else if(avg >=70) {
				hak ='C';
			}else {
				hak = 'F';
			}
			int rank =1;
			
			/*
			arr[i][0] = num;
			arr[i][1] = sum;
			arr[i][2] = avg;
			arr[i][3] = hak;
			arr[i][4] = rank;
			*/
			
			//1�����迭 ���� �ֱ�
			int[] person = new int[5];
			person[0] = num;
			person[1] = sum;
			person[2] = avg;
			person[3] = hak;
			person[4] = rank;
			
			arr[i] = person;
			
			
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][1] < arr[j][1]) {
					arr[i][4]++;
				}
			}
		}
		
		//����
		//�ӽ����� �迭
		int[] tmp = new int[5];
		for (int i = 0; i < tmp.length-1; i++) {
			for (int j = i+1; j < tmp.length; j++) {
				if(arr[i][4] > arr[j][4]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(j==3) {
					System.out.print((char)(arr[i][j])+" ");
				}else {
					System.out.print(arr[i][j]+ " ");					
				}
			}
			System.out.println();
		}
		
		
	}
}
