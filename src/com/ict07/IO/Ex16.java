package com.ict07.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex16 {
	public static void main(String[] args) {
		// BufferWrite : �ӵ������ ���� ���. �ٹٲٱ� �޼ҵ尡 �����Ѵ�.
		String pathname = "c:"+File.separator+"study"+File.separator+"util"+File.separator
							+"ict05.txt";
		File file = new File(pathname);
		FileWriter fw =null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			//�ѱ��� ���
			bw.write(97);	//a
			bw.write(65);	//A
			
			//int �̹Ƿ�  char�� ��ó�� �� �ִ�.
			bw.write('J');
			bw.write('A');
			bw.write('V');
			bw.write('A');
			bw.write('��');	//FileOutputStream�� �ȵ����� FileWriter�� ����
			bw.write('��'); //FileOutputStream�� �ȵ����� FileWriter�� ����
			bw.write('J');
			bw.write('A');
			bw.write('V');
			bw.write('A');
			
			char[] c = {'k','o','r','e','a',13,'��','��','��','��'};
			bw.write(c);
			
			bw.write("�ѱ� ICT���簳�߿�\n ");
			bw.newLine(); //�� ���� �޼ҵ�
			bw.write("1���ǽ�\n");
			bw.newLine();
			bw.write("�ڹټ���\n");
			bw.newLine();
			
			bw.flush();		
		} catch (Exception e) {
			
		}finally {
			try {
				bw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
