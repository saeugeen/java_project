package test;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("번호");
			int no = scan.nextInt();
			System.out.print("국어");
			int kor = scan.nextInt();
			System.out.print("영어");
			int eng = scan.nextInt();
			System.out.print("수학");
			int math = scan.nextInt();
			int sum =kor+eng+math;
			int avg =sum/3;
			int hak=0;
			
			if(avg >=90) {
				hak='A';
			}else if(avg>=80) {
				hak='B';
			}else if(avg>=80) {
				hak ='c';
			}else {
				hak ='f';
			}
			int rank =1;
			int[] person =new int[5];
			person[0]=no;
			person[1]=sum;
			person[2]=avg;
			person[3]=hak;
			person[4]=rank;
			arr[i] =person;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][2]<arr[j][2]) {
					arr[i][4]++;
				}
			}
		}
		int[] tmp = new int[5];
		for (int i = 0; i < tmp.length; i++) {
			for (int j = 0; j < tmp.length; j++) {
				if(arr[i][1] > arr[j][1]) {
					tmp = arr[i];
					arr[i] =arr[j];
					arr[j] =tmp;
				}
			}
		}
		
			System.out.print("번호 ");
			System.out.print("합 ");
			System.out.print("평균 ");
			System.out.print("학점 ");
			System.out.println("랭크 ");
		
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
