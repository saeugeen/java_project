package com.ict01.grammar02;
class Ex07{
	public static void main(String[] args){
	//�̸��� ȫ�浿�� ����� ���� :90, ����:80, ���� :90�̴�
	//������ ����� ���ؼ� �̸�, ����,����� �������
	int a =90;
	int b = 80;
	int c = 90;
	String name =" ȫ�浿";
	
	int total = a+b+c;
	double average = total/3.0;
	double average2 =(int)(average*10) /10.0;
	
	System.out.println("�̸� :" + "���� : "+total + "��� :"+ average2);

	

	}
}