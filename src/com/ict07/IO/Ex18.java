package com.ict07.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex18 {
	public static void main(String[] args) {
		// BufferedReader : �ӵ������ ���ؼ� ��� , ���� �� �д� �޼ҵ尡 ����
		String pathname = "c:"+File.separator+"study"+
					       File.separator+"util"+File.separator+"ict06.txt";
		File file = new File(pathname);
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
					
			// �ѱ��� �б� 
			// int k = br.read();
			// System.out.println((char)(k));
			
			// ��ü �б�
			/*
			int k = 0 ;
			while ((k=br.read())!= -1) {
				System.out.print((char)(k));
			}
			*/
			// char[] �̿�
			/*
			 char[] c = new char[(int)(file.length())];
			 br.read(c);
			 for (char k : c) {
			 	System.out.print(k);
			 }
			  */	
			// String �̿�
			/*
			char[] c = new char[(int)(file.length())];
			br.read(c);
			String msg = new String(c);
			System.out.println(msg);
			*/
			
			// ù �� �б�
			//String msg = br.readLine();
			//System.out.println(msg);
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while(msg==br.readLine()) {
				sb.append(msg+"\n");
			}
			System.out.println(sb.toString());
					
		} catch (Exception e) {
		} finally {
			try {
				br.close();
				fr.close();	
			} catch (Exception e2) {
			}
		}
	}
}
