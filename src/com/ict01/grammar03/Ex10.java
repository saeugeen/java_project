package com.ict01.grammar03;
class Ex10{
	public static void main(String[] args){
	// if ~else ~: ���ǽ��� ���ϋ��� �����϶� ���� ������ ó���Ѵ�.
	// ���� : if (���ǽ�) {
	//		���ǽ��� ���϶� ������ ����;
	//		���ǽ��� ���϶� ������ ����;
	//	}else{
	//		���ǽ��� �����϶� ������ ����;
	//		���ǽ��� �����϶� ������ ����;
	//	}
	//	�� , ������ ������ �� ���̸� ���� �����ϴ�.

	int k1=70;
	String res=" ";
	if(k1>=60){
		res ="�հ�";
	}else{
		res="���հ�";
	}
	System.out.println(res);



	int k2=2;
	String res2=" ";
	if(k2%2==0){
		res2="¦��";
	}else{
		res2="Ȧ��";
	}
	System.out.println(res2);

	
	char k3 = 'c';
	String res3 = " ";
	if(k3>='A' && k3<='Z'){
		res3="�빮��";
	}else{
		res3="�ҹ���";
	}
	System.out.println(res3);
	

	

	int pay=8720;
	int hour =10;
	int res4 = 0;
	if(hour>8){
		res4=pay*8 + (int)(pay*1.5*(hour-8));
	}else{
		res4=pay*hour;
	}
	System.out.println(res4);
	
	}
}