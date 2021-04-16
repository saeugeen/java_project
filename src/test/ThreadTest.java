package test;

public class ThreadTest implements Runnable{
	
	int x=0;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+(++x));
			if(x ==50 || x==100) {
				try {
					wait();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
				notify();
			}
		}
	}
}
