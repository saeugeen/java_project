package com.ict07.IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		//	바이트 - 문자 결합 : 체인 방식
		//	입력 : InputStreamReader : InputStream -> Reader
		//		   InputStream -> InputStreamReader ->Reader -> BufferedReader
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 문자 입력 : ");
		String msg = scan.next();
		System.out.println("받은 문자: "+msg);
		*/
		
		System.out.print("원하는 문자 입력 : ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String msg = br.readLine();
			System.out.println("받은 문자: "+msg);
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
