package com.ict01.grammar03;
import java.util.Scanner;

class Ex08{
	public static void main(String[] args){
	//���ڸ� �޾Ƽ� Ȧ��, ¦���� ��������
	Scanner sc = new Scanner(System.in);

	System.out.println("���ڸ� �Է��ϼ���");
	int i =sc.nextInt();
	
	String res1 = (i%2==0)?"¦��":"Ȧ��";
	System.out.println("��� :" +res1);

	System.out.println("���������� �Է��ϼ���");
	int kor = sc.nextInt();
	System.out.println("���������� �Է��ϼ���");
	int eng = sc.nextInt();
	System.out.println("���������� �Է��ϼ���");
	int math = sc.nextInt();
	
	//int aveg = (kor + eng+ math)/3;
	int sum = kor + eng+math;
	double aveg = (int)(sum/3.0*10) /10.0;
	String res2 = (aveg >=60) ? 
		(kor>=40 && eng>=40 && math>=40 ) ? "�հ�":"���հ�" : ("���հ�" ) ;
	System.out.println("���2 :" +res2);

	
	System.out.println("�˹ٽð��� �Է��ϼ���:");
	int hour =sc.nextInt();
	int pay =8720;
	double result3 = (hour>8) ? (pay*8)+((hour-8)*pay*1.5) : 8720*hour; 
	System.out.println("���3  :  " + (int)(result3));

	}
}