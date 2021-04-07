package com.ict06.Thread;

//두개의 스레드를 생성하여 첫번째 스레드의 출력을 1-50까지 출력하고
//두번째이 스레드의 출력을 51-100까지 출력하고,
//다시 첫번째 스레드가 101-150까지 출력
//두번째 스레드가 151-200까지 출력(syncronized, wait, notify)
public class Ex16 implements Runnable{
	int x =0;
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 101; i++) {
			System.out.println(Thread.currentThread().getName()+":"+(++x));
			if(x==50 || x==100) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}else {
				notify();
			}
		}
	}
}
