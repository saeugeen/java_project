package com.ict01.grammar02;
class Ex03{
	public static void main(String[ ] args){
	//������ : �Ҽ����� ���� ����
	//������ : byte < short < int < long
	//�������� �⺻�� int �̴�.
	// ���� ���� : byte , short �� �����ϸ� ����� ������ int �̻�
	
	//byte : -128 ~ 127 ���� ���ڸ� ��� ����
	byte s1 = -127;
	System.out.println(s1);

	s1 = -128;
	System.out.println(s1);
	
	//byte ������ ����� �����߻�
	
	//s1 = -129;
	System.out.println(s1);
	
	//short : -32768 ~ 32767 ���� �ȿ� �����ϴ� ������ ����
	//�����߻� : ������� ����ȴ�.(����� ���� ���ؾ� �Ѵ�)
	//short s2 = 32760 +100 ; 
	//System.out.println(s2);

	//int �� long �� ������ �ܿ� �ʿ� x
	//������ �Ϲ����� ������ int
	//���� ū ������ ����ϰ��� �Ҷ��� long�� ���
	//long���� ���� �ڿ� L �̳� l �� ���δ�. (���� ����)
	int s3 =117;
	long s4= 117L;
	long s5 = 117l;
	long s6 = 117;

	//�Ǽ�  :  �Ҽ����� �����ϴ� ��
	//	������ �������ٴ� ũ��.
	//�Ǽ��� �⺻���� double �̴�.
	//float�� ���� �ڿ� f , F �� ���δ� (���� �Ұ���) 
	// char < ���� < float < double

	float s7 = 3.14f;
	System.out.println(s7);

	double s8 = 3.14;
	System.out.println(s8);

	double s9 = 117;
	System.out.println(s9);
	}
}