package com.ict03.class01;

public class Ex13 {
	private String name = "����";
	private int age = 3;
	private String addr = "����";
	
	//������ �����ε�
	//�⺻ ������
	public Ex13() {
		//this : ��ü ���ο��� ��ü �ڽ��� ��Ī�Ҷ�
		//this.���� : ��������
		
		//this() : �����ڰ� �����ڸ� ȣ���Ҷ� ����ϴ� �����
		//		   �ݵ�� ������ ù�ٿ��� ��밡��
		
		
		this("������", 21 ,"����");
		
		System.out.println("�⺻ ������: " + this);
		//System.out.println(this.name);
		//System.out.println(this.getName());
	}
	public Ex13(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Ex13(int age,String name) {
		this(name,age,"����");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public Ex13(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
		System.out.println("4��° ������");
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
