package com.ict08.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Ex02 {
	public static void main(String[] args) {
		// URL Ŭ���� : URL(Uniform Resource Locator) :���� ������ �ڿ��� �ּҸ� ���Ѵ�.
		//				final Ŭ�����̱� ������ ��� �ȵ�,
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		String pathname ="c:"+File.separator+"study+"+File.separator+"util"+File.separator+"���û.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw =null;
		
		try {
			//���� ���������� ����
			URL url = new URL("https://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			is = url.openStream();
			isr = new InputStreamReader(is,"UTF-8");
			br = new BufferedReader(isr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg =br.readLine())!=null) {
				sb.append(msg+"\n");
			}
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();
			System.out.println(sb.toString());
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {
				System.out.println(e2);

			}
		}
	}
}