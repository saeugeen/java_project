package com.ict01.grammar04;
class Ex02 
{
	public static void main(String[] args) 
	{
		//for��  : ������ ��Ģ�� ���� ���๮�� �ݺ� ó���ϴ� ��
		//���� : for (�ʱ��; ���ǽ�; ������;){
		//			���ǽ��� ���϶� ������ ����;
		//			���ǽ��� ���϶� ������ ����;
		//			}
		
		//for ���� ������ ������ �ʱ������ �̵�
		// �ʱ�Ŀ����� ���ǽ����� �̵�
		// ���ǽ��� ���̸� for���� ����
		//	���ǽ��� �����̸� for�� ������ ����������.
		// for�� ���� �� for���� ���� ������ ������ ���������� �̵�. 
		// �������� ������ ���ǽ����� �̵�

		//�ȳ��ϼ��� , ���� ����ϱ�
		for (int i=1; i<11; i++)
		{
			System.out.println(i+"�ȳ��ϼ���!");
		}

		// 0-15���� ���
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

		//0 -10 ���� ������ ���ϱ�
		int sum=0; //�������� ����ϴ� ����
		for (int i=0; i<11; i++)
		{
			System.out.println(sum + "+"+ i);
			sum = sum+i; //i�� ������
			
		}
		System.out.println("��:"+ sum);



		//Ȧ���� ���� ��
		
		int odd =0 ;
		for (int i=0; i<11; i++)
		{
			if(i%2==1){
				odd +=i;
			}
			
		}
		System.out.println("Ȧ�� ��:"+ odd);
		//
		


		int even =0 ;
		for (int i=0; i<11; i++)
		{
			if(i%2==1){
				even +=i;
			}
			
		}
		System.out.println("¦�� ��:"+ even);

		
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
		System.out.println("¦�� ��:"+ even);
		System.out.println("Ȧ�� ��:"+ odd);



		System.out.println("======================");

		int total=1 ;
		for(int i=7; i>0; i--){
			total=total*i;
		}
			System.out.println("7!:"+ total);
		
	}
}
