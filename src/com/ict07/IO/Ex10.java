package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.imageio.stream.FileImageInputStream;

public class Ex10 {
	public static void main(String[] args) {
		// c:\\study\\util\\test100.txt ���Ͼȿ� 
		//	������ �д� ������ �ۼ��Ͻÿ�.
		//	
		//	
		String pathname = "C:"+File.separator+"study"+File.separator
				+"util"+File.separator+"test100.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			byte[] b = new byte[(int)(file.length())];
			bis.read(b);
			String msg = new String(b);
			System.out.println(msg);
		}catch(Exception e){
			
		}finally {
			try {
				bis.close();
				fis.close();
			}catch(Exception e2) {
				
			}
		}
		
		
	}
}
