package com.ict01.grammar02;
class Ex06{
	public static void main(String[] args){
	//���������; + , - , * , / , %
	//���� �ڷ����� ū �ڷ����� �����ϸ� ū �ڷ������� ����
	//����)byte + byte = byte(x), int(0)
	//      short + short =int
	// byte + byte = short(X), int(0)
	
	//������ ����
	int k1 = 21755;
	int s1 = k1/10;
	int s2 = s1 * 10;
	int s3 = (k1/10)*10;

	System.out.println("s3=" + s3);
	System.out.println("s4=" + 43);
	//�Ҽ��� ù°�ڸ����� ���ϱ�
	//douvle k2 = 246,846;
	//double s5 = (int)(k2*10);
	//double  s6 = s5/10.0;
	
	//double s7 = (int)(k2*10)/10.0;
	//double s8 =(int)(24.6843*10)/10.0;


	//System.out.println("s7=" + s7);
	//System.out.println("s8=" + s8);

	// '%' ���� �������� ���Ѵ�.
	// '/' ����� int�̸� ��
	int su1 =7;
	int su2 = 3;
	int res1 = 7/3;
	int res2 = 7%3;

	System.out.println(res1 );
	System.out.println(res2 );
	
	
	}

}