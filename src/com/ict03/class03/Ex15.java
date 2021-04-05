package com.ict03.class03;

public class Ex15 extends Ex14{
	String name = "홍일점";
	int id = 2410;
	
	public Ex15() {
		super("일지매", 15);
		System.out.println("자식 클래스 생성자: "+this);
		name = "홍두께";
		id = 1004;
	}

	public Ex15(String name) {
		super("태권브이", 37);
		this.name = name;
	}
	
	
}
