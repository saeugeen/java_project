package com.ict03.class01;

public class Ex10 {
	private String name;
	private int price;
	private int pay;
	
	public void order(int num) {
		if(num==1) {
			pay = pay+3000;
		}else if(num==2) {
			pay = pay+2000;
		}else if(num==3) {
			pay = pay+4000;
		}else if(num==4) {
			pay = pay+3500;
		}else {
			System.out.println("¿À·ù");
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
