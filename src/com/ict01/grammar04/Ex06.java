package com.ict01.grammar04;
import java.util.Scanner;

class Ex06 
{
	public static void main(String[] args) 
	{
		//do ~ while �� : while ���� ���� �ݺ���
		//					���� ���� �� ���߿� ���Ѵ�.
		//����)
		//	�ʱ��;
		// do{
		//		������ ����;
		//		������;
		//		}while(���ǽ�);
		int i=0;
		do
		{
			System.out.print(i+ " ");
			i++;
		}
		while (i<11);
		System.out.println( );


		Scanner sc = new Scanner(System.in);

		System.out.println("���ϴ� Ƚ���� �����ϼ���.");
		int time = sc.nextInt();
		i=1;
		do
		{
			System.out.print("�ȳ� ");
			i++;
		}
		while (i<=time);


		//�ݺ� Ƚ���� �Ϲ� ���ڸ� �޾Ƽ� Ȧ�� ,¦���� ���
		
		System.out.println("���ϴ� Ƚ���� �����ϼ���.");
		int su =sc.nextInt();
		
		i =1;
		String msg ="";
		do
		{
			System.out.println("��ȣ�� �����ϼ���.");
			int num =sc.nextInt();
			if (num%2==0)
			{
				msg = "¦��";
			}else{
				msg = "Ȧ��";
			}
			System.out.println("�Է��� �� " + num + "��" + msg +"�Դϴ�.");
			i++;
		}
		while (i<=su);

	}
}
