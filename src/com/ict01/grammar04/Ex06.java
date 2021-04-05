package com.ict01.grammar04;
import java.util.Scanner;

class Ex06 
{
	public static void main(String[] args) 
	{
		//do ~ while 문 : while 문과 같은 반복문
		//					먼저 실행 후 나중에 비교한다.
		//형식)
		//	초기식;
		// do{
		//		실행할 문장;
		//		증감식;
		//		}while(조건식);
		int i=0;
		do
		{
			System.out.print(i+ " ");
			i++;
		}
		while (i<11);
		System.out.println( );


		Scanner sc = new Scanner(System.in);

		System.out.println("원하는 횟수를 선택하세요.");
		int time = sc.nextInt();
		i=1;
		do
		{
			System.out.print("안녕 ");
			i++;
		}
		while (i<=time);


		//반복 횟수와 일반 숫자를 받아서 홀수 ,짝수를 출력
		
		System.out.println("원하는 횟수를 선택하세요.");
		int su =sc.nextInt();
		
		i =1;
		String msg ="";
		do
		{
			System.out.println("번호를 선택하세요.");
			int num =sc.nextInt();
			if (num%2==0)
			{
				msg = "짝수";
			}else{
				msg = "홀수";
			}
			System.out.println("입력한 수 " + num + "는" + msg +"입니다.");
			i++;
		}
		while (i<=su);

	}
}
