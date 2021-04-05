package com.ict01.grammar04;
class Ex01{
	public static void main(String[] args){
	//swich ~ case�� : if ���� ���� �б⹮
	// if���� ���ǽ��� boolean��, �񱳿���, ������
	//switch���� byte, short, int, char , String �϶� ���
	//������ ������ �⺻�����δ� if���� ����Ѵ�.
	//switch���� 100% if������ ��ȯ�� �����ϴ�. (�ݴ�� ���غ�����)
	//���� : 
	//	switch(���ڰ�(char, int , String)){
	//	case ���ǰ�1 : ���ڰ��� ���ǰ�1�� ������; break;
	//	case ���ǰ�2 : ���ڰ��� ���ǰ�2�� ������; break;
	//	case ���ǰ�3 : ���ڰ��� ���ǰ�3�� ������; break;
	//	default : ���ǰ� 1,2,3 ��� �䱸�ϴ� ���� �ƴѶ�, �� ������
	//	}
	// ** ���ǻ��� ** break���� ������ ���� break���� ���������� ��� ���๮�� �����Ѵ�.
	//break���� �ش� switch���� ���������� ������ �Ѵ�.

	//char k1 �� A�̸� ������ī B�̸�....
	char k = 'c';
	String str = "";
	switch(k){
		case 'A' : str = "������ī"; break;
		case 'B' : str = "�����"; break;
		case 'C' : str = "ĳ����"; break;
		default :str ="�ѱ�";
	}
	System.out.println("���:"+str);      





	//char k1 �� A,a�̸� ������ī B,b�̸�....
	char k1 = 'c';
	String str1 = "";
	switch(k1){
		case 'A' : 
		case 'a' : str1 = "������ī"; break;
		case 'B' : 	
		case 'b' : str1 = "�����"; break;
		case 'C' :
		case 'c' : str1 = "ĳ����"; break;
		default :str1 ="�ѱ�";
	}
	System.out.println("���:"+str1);    

	//int k2 �� 1�Ǵ� 3�̸� ����, 2�Ǵ� 4�̸� ����
	int k2 =3;
	String str2= "";
	switch(k2){
		case 1:
		case 3: str2 = "����"; break;
		case 2:
		case 4:str2 ="����"; break;
	}
	System.out.println("���:"+str2);

	



	//int k3�� �ѱ��̸� ����, �߱��̸�....
	String k3 = "�ѱ�";
	String str3= "";
	switch(k3){
		case "�ѱ�" : str3 ="����" ; break;
		case "�߱�" : str3 ="����¡" ; break;
		case "�Ϻ�" : str3 ="����" ; break;
		default: str3 = "�����Ϳ� ���� ���� �Դϴ�. ";
	}
	System.out.println("���:"+str3);
	
	}
}