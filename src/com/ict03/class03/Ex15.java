package com.ict03.class03;

public class Ex15 extends Ex14{
	String name = "ȫ����";
	int id = 2410;
	
	public Ex15() {
		super("������", 15);
		System.out.println("�ڽ� Ŭ���� ������: "+this);
		name = "ȫ�β�";
		id = 1004;
	}

	public Ex15(String name) {
		super("�±Ǻ���", 37);
		this.name = name;
	}
	
	
}
