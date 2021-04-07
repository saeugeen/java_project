package com.ict06.Thread;

public class Ex12_main {
	public static void main(String[] args) {
		System.out.println("main ����");
		Ex12 t1 = new Ex12();
		Thread thread1 = new Thread(t1);
		thread1.start();

		// join() : ���罺����� join()�� ȣ���� �����尡 ������ ���� 
		//			�����¿� ���� �ִٰ� join()�� ȣ���� �����尡
		//			������ �ٽ� �����Ѵ�.
		// 			��, join()�� ȣ���� �����尡 ������ ���� ���� �� �� ����.
		
		try {
			thread1.join();
			for (int i = 1; i < 51; i++) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main ��");
	}
}
