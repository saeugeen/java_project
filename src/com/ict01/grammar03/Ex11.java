package com.ict01.grammar03;
import java.util.Scanner;

class Ex11{
	public static void main(String[] args){
	// ���� if�� : ���ǽ��� �����϶� �ٽ� ���ǽ��� ����Ѵ�. 
	// if (���ǽ� 1){
	//	���ǽ�1�� ���϶� ����;
	//	}else if(���ǽ�2){
	//	���ǽ�1�� �����̸鼭 ���ǽ�2�� ���϶� ����;
	//	}else if(���ǽ�3){
	//	���ǽ�1,2�� �����̸鼭 ���ǽ�3�� ���϶� ����;
	//	}else{
	//	���ǽ� 1,2,3 ��� �����϶�, �������� ���
	//	}
	
	int k1 = 88;
	String str1="";
	if(k1>=90){
		str1 ="A";
	}else if(k1>=80){
		str1="B";
	}else if(k1>=70){
		str1="C";
	}else{
		str1="F";
	}
	System.out.println(str1);	




	char k2 ='A';
	String str2="";
	if(k2>='A' && k2<='Z'){
		str2 ="�빮��";
	}else if(k2>='a' && k2<='z'){
		str2="�ҹ���";
	}else if(k2>='0' && k2<='9'){
		str2="����";
	}else{
		str2="��Ÿ����";
	}
	System.out.println(str2);
	
	


	int k3 = 'A';
	String str3="";
	if(k3>='A' && k3<='a' ){
		str3 ="������ī";
	}else if(k3>='B' && k3<='b' ){
		str3 ="�����";
	}else if(k3>='C' && k3<='c' ){
		str3 ="ĳ����";
	}else{
		str3="�ѱ�";
	}
	System.out.println(str3);	



		

	Scanner sc = new Scanner(System.in);

	System.out.println("��ȣ�� �Է��ϼ���.");
	int menu = sc.nextInt();
	int moka =3500;
	int latte = 4000;
	int ame = 3000;
	int fruit = 3500;
	int pay=0;
	
	if(menu==1){
		pay = 10000 - moka*2 - (int)(moka*2*0.10);
	}else if(menu==2){
		pay = 10000 -latte*2 - (int)(latte*2*0.10);
	}else if(menu==3){
		pay = 10000 - ame*2 - (int)(ame*2*0.10);
	}else if(menu==4){
		pay = 10000 - fruit*2 - (int)(fruit*2*0.10);
	}else{
		System.out.println("error");
	}
	System.out.println(pay);

	
	}
}