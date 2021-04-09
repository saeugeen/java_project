package com.ict07.IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		//	����Ʈ - ���� ���� : ü�� ���
		//	�Է� : InputStreamReader : InputStream -> Reader
		//		   InputStream -> InputStreamReader ->Reader -> BufferedReader
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.print("���ϴ� ���� �Է� : ");
		String msg = scan.next();
		System.out.println("���� ����: "+msg);
		*/
		
		System.out.print("���ϴ� ���� �Է� : ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String msg = br.readLine();
			System.out.println("���� ����: "+msg);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				isr.close();
			}catch (Exception e2) {
			}
		}
		
		
	}
}