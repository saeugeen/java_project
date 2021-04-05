package com.ict01.grammar04;
class Ex04 
{
	public static void main(String[] args) 
	{
		//while문 : for 문과 같은 반복문
		//형식 1)											형식 2)
		// 초기식;											초기식;
		//while(조건식){									while(true){
		//	조건식이 참일때 실행할 문장;					if(빠져나갈조건) break; (먼저 탈출)
		//	조건식이 참일때 실행할 문장;					조건식이 참일때 실행할 문장;
		//	증감식;											if(빠져나갈조건) break; (먼저 탈출)
		//	}												증감식;		
		// **while 문 끝을 만나면 조건식으로 이동하라

		int i=0;
		while (i<16)
		{
			System.out.print(i +" ");
			i++;

		}
		System.out.println(" ");


		i=0;
		while (true)
		{
			if(i>=16) break;
			System.out.print(i +" ");
			i++;
		}
		System.out.println(" ");
		

		i=0;
		while (true)
		{
			if(i>11) break;
			i++;
			if(i%2==0){
				System.out.print(i +" ");
			}
		}
		System.out.println(" ");


		i=0;
		while (true)
		{
			if(i>11) break;
			i++;
			if(i%2==1){
				System.out.print(i +" ");
			}
		}
		System.out.println(" ");

		i=0;
		while (true)
		{
			if(i>51) break;
			i++;
			if(i%7==0){
				System.out.print(i +" ");
			}
		}
		System.out.println(" ");
		
		

		i=1;
		while (i<17)
		{
			System.out.print(" 0 ");
			if(i%4==0){
				System.out.println();
			}
			i++;
		}


		int sum=0;
		i=0;
		while (i<11)
		{	
			sum=sum+i;
			i++;
		}
		System.out.println("누적합은:"+sum);


		int odd=0;
		int even=0;
		i=0;
		while (i<11)
		{
			if(i%2==0){
				even = even +i;
			}else{
				odd = odd+i;
			}
			i++;
		}
		System.out.println("짝수의 합:"+even+"홀수의 합:"+odd);
	}
}
