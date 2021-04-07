package com.ict06.Thread;

//�ΰ��� �����带 �����Ͽ� ù��° �������� ����� 1-50���� ����ϰ�
//�ι�°�� �������� ����� 51-100���� ����ϰ�,
//�ٽ� ù��° �����尡 101-150���� ���
//�ι�° �����尡 151-200���� ���(syncronized, wait, notify)
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
