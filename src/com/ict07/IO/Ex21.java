package com.ict07.IO;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Ex21 {
	public static void main(String[] args) {
		// ����Ʈ - ���� ���� : ü�� ���
		// �Է� : OutputStreamWriter : OutputStream -> Writer
		// OutputStream -> OutputStreamWriter ->Writer -> BufferedWriter
		
		String msg ="qfqwfqw";
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);
		try {
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			String msg1 = bw.toString();
			System.out.println("���� ����: "+msg1);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				osw.close();
			}catch (Exception e2) {
			}
		}

	}
}
