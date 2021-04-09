package com.ict07.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex22 {
	public static void main(String[] args) {
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.print("���ϴ� ���� �Է� : ");
		String msg = scan.next();
		System.out.println("���� ����: "+msg);
		*/
		//InputStreamReader�� OutputStreamWriter�� �̿��ؼ� �ۼ��Ͻÿ�
		
		//����Ϳ� ���
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		//Ű���带 ���� �Է�
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			
			bw.write("���ϴ� ���� �Է�: ");
			bw.flush();
			
			String msg = br.readLine();
			
			// int k = Integer.parseInt(msg);
			bw.write("���� ����: " + msg);
			bw.flush();
		} catch (Exception e) {
		}finally {
			try {
				br.close();
				isr.close();
				bw.close();
				osw.close();
			} catch (Exception e2) {
			}
		}
	}
}