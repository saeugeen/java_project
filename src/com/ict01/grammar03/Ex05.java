package com.ict01.grammar03;
class Ex05{
	public static void main(String[] args){
	int k1 =65;
	String result = (k1>=60) ? "�հ�" : "���հ�";
	System.out.println("���1" + result);
	//int k1�� 60�̻��̸� �հ� �ƴϸ� ���հ�

	
	int k2 =3;
	String result2 = (k2%2 == 0) ? "¦��" : "Ȧ��";
	System.out.println("���2  :" + result2);
	// int k2�� Ȧ�� ���� ¦������ �Ǻ�����

	int k3 = 'c';
	String res3 = (k3 >='A' && k3<= 'Z') ? "�빮��" : "�빮�ڰ� �ƴϴ�";	
	System.out.println("���2  :" + res3);
		
	int hour =10;
	int pay=8720;
	double result3 = (hour>8) ? (pay*8)+((hour-8)*pay*1.5) : 8720*hour; 
	System.out.println("���3  :  " + (int)(result3));
	//�ٹ��ð��� 8�ð������� �ð��� 8720�̰�
	//8�ð��� �ʰ��� �ð���ŭ�� 1.5���̴�.
	//���� �ٹ��ð��� 10�ð��̴�.
	//�󸶸� �޾ƾ��ϳ�
	}
}