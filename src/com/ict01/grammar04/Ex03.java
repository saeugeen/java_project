package com.ict01.grammar04;
class Ex03 
{
	public static void main(String[] args) 
	{
		//다중 for문 : for문안에 for문이 존재함
		for (int i=1; i<4; i++)
		{
			for (int j=1; j<6; j++)
			{
				System.out.println("i="+i +", j=" +j);
			}
		}

		System.out.println("------------");

		for (int i =2; i<5; i++)
		{
			for (int j=1; j<5; j++)
			{
				System.out.print(i +"*"+ j+"=" +i*j );
				System.out.print("  ");
			}System.out.println();
		}

		System.out.println("------------");

		for (int i =2; i<5; i++)
		{

			for (int j=1; j<5; j++)
			{
				System.out.print(j +"*"+ i+"=" +i*j );
				System.out.print("  ");
			}System.out.println();
		}


		System.out.println("=========");

		for (int i =1; i<5; i++)
		{

			for (int j=1; j<5; j++)
			{
				System.out.print("0" );
				
			}System.out.println();
		}


		System.out.println("=========");

		for (int i =1; i<5; i++)
		{

			for (int j=1; j<5; j++)
			{
				if(i==j){
						System.out.print("1" );
				}else{
				System.out.print("0" );
				}
				
			}System.out.println();
		}
	}
}
