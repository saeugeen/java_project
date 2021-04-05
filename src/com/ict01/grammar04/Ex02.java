package com.ict01.grammar04;
class Ex02 
{
	public static void main(String[] args) 
	{
		//for문  : 정해진 규칙에 따라 실행문을 반복 처리하는 문
		//형식 : for (초기식; 조건식; 증감식;){
		//			조건식이 참일때 실행할 문장;
		//			조건식이 참일때 실행할 문장;
		//			}
		
		//for 문을 만나면 무조건 초기식으로 이동
		// 초기식에서는 조건식으로 이동
		// 조건식이 참이면 for문을 실행
		//	조건식이 거짓이면 for문 밖으로 빠져나간다.
		// for문 실행 중 for문의 끝을 만나면 무조건 증감식으로 이동. 
		// 증감식이 끝나면 조건식으로 이동

		//안녕하세요 , 열번 출력하기
		for (int i=1; i<11; i++)
		{
			System.out.println(i+"안녕하세요!");
		}

		// 0-15까지 출력
		for (int i =0; i<16; i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();



		for (int i=1; i<11; i++)
		{
			if(i%2==0){
				System.out.print(i);
			}
		}
		System.out.println();
		//

		for(int i=1; i<11; i++)
		{
			if(i%2==1){
				System.out.print(i);
			}
		}
		System.out.println();

		for(int i=1; i<51; i++)
		{
			if(i%7==0){
				System.out.print(i);
			}
		}
		System.out.println();

		for(int i=1; i<10; i++){
				System.out.print(i*5 + " ");
		}
		System.out.println();

		/*for (int i=0; i<5; i++)
		{
			for (int j=0; j<5; j++)
			{
				if(i*j==0 ){
					System.out.print	(i*j +" ");
					
				}
			}
		}*/

		for (int i=1; i<17; i++)
		{
			System.out.print("0");
			if(i%4==0){
				System.out.println();
			}
		}

		//0 -10 까지 누적합 구하기
		int sum=0; //이전값을 기억하는 변수
		for (int i=0; i<11; i++)
		{
			System.out.println(sum + "+"+ i);
			sum = sum+i; //i의 누적합
			
		}
		System.out.println("합:"+ sum);



		//홀수의 누적 합
		
		int odd =0 ;
		for (int i=0; i<11; i++)
		{
			if(i%2==1){
				odd +=i;
			}
			
		}
		System.out.println("홀수 합:"+ odd);
		//
		


		int even =0 ;
		for (int i=0; i<11; i++)
		{
			if(i%2==1){
				even +=i;
			}
			
		}
		System.out.println("짝수 합:"+ even);

		
		even = 0;
		odd = 0 ;
		for (int i=0; i<11; i++)
		{
			if(i%2==0){
				even +=i;
			}else{
				odd += i;
			}
		}
		System.out.println("짝수 합:"+ even);
		System.out.println("홀수 합:"+ odd);



		System.out.println("======================");

		int total=1 ;
		for(int i=7; i>0; i--){
			total=total*i;
		}
			System.out.println("7!:"+ total);
		
	}
}
