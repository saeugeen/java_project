package com.ict06.Thread;

public class Ex11 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println(Thread.currentThread().getName()+": 1111111");
		}
	}
}
