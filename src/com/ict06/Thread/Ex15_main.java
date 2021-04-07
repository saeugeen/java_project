package com.ict06.Thread;

public class Ex15_main {
	public static void main(String[] args) {
		Ex15 t1 = new Ex15();
		
		Thread thread_1 = new Thread(t1,": 1");
		thread_1.start();
		
		Thread thread_2 = new Thread(t1,": 2");
		thread_2.start();
		
	}
}
