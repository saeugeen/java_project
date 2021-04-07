package com.ict06.Thread;

public class Ex10 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println(Thread.currentThread().getName()+": aaaaaa");
		}
	}
}
