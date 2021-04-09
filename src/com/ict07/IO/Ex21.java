package com.ict07.IO;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Ex21 {
	public static void main(String[] args) {
		// 바이트 - 문자 결합 : 체인 방식
		// 입력 : OutputStreamWriter : OutputStream -> Writer
		// OutputStream -> OutputStreamWriter ->Writer -> BufferedWriter
		
		String msg ="qfqwfqw";
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);
		try {
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			String msg1 = bw.toString();
			System.out.println("받은 문자: "+msg1);
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
