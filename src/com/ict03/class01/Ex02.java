package com.ict03.class01;

public class Ex02 {
	// Ŭ���� �ȿ��� 3������ ����
	// ����ʵ�, ����޼ҵ� , ������
	// ����ʵ� : ����� ���� , static�� instance�� ��������.
	
	int k1 = 80;		    	// �ν��Ͻ� ���� == �Ϲ� ����
	static int k2 = 90;			// static ����
	final int k3 = 85;			// �ν��Ͻ� ��� 
	static final int k4 = 95;	// static ��� = API���� �����ϴ� �������
	
	// final �����ϸ� ���
	// static ������ �ν��Ͻ�(��ü �����Ҷ� ���� ���������.)
	// static�̶� ��ü ������ ������� �̸� ���������.
	
	//��� �޼ҵ� : �����̳� ���
	//�޼ҵ�� �ڱ⸦ ȣ���� ������ �ǵ��� ����.
	//�ν��Ͻ� , ��ȯ���� ����. ( ���� �����Ͱ� ���� )
	public void prn01() {
		k1 = k1 + 20;
		k2 = k2 + 10;
		System.out.println("k1= " +k1);
		System.out.println("k2= " +k2);
		// final�� ������ ����̴�. ����� �� ������ �Ұ� // ���� �߻�
		// k3 = k3 + 15;
		// k4 = k4 + 5 ;
		
		// ���� ���� : �޼ҵ� �ȿ��� ������� ����
		// 			   �޼ҵ� �ȿ��� ������� ������ �޼ҵ带 ȣ���Ҷ� ���� �ȴ�.
		//			   �޼ҵ尡 ������ �������.
		//			   instance���������� static�� ���� �� ����.
		
		int s1 = 10;
		//static int s2 = 90;			
		final int k3 = 85;			
		//static final int s4 = 95;
		
	}
	
	//static , ��ȯ���� ����.
	public static void prn02() {
		//static �޼ҵ忡�� �ν��Ͻ� ������ ����Ҽ� ����.
		//k1 = k1 + 20;
		k2 = k2 + 10;
		//k3 = k3 + 15;
		//k4 = k4 + 5 ;
		System.out.println("k2= "+k2);
		
		//���������� static �� ���� �� ����.
		int s1 = 10;
		//static int s2 = 90;			
		final int k3 = 85;			
		//static final int s4 = 95;
		
	}
	//�ν��Ͻ� , ��ȯ���� ����, ������ �� return '���� ������'
	public int prn03() {
		return 'c';		//��ȯ������ ���� �ڷ���
		//return 14;    //��ȯ���̶� ���� �ڷ��� 
	}
	//static, ��ȯ���� ����
	public static double prn04() {
		return 147;
		//return 3.14;
	}
}
