package test;

import java.io.*;
import java.util.Scanner;

public class Ex {
	public static void main(String[] args) {
		// 모든 파일을 복사 및 붙이기 하는 경우
		Scanner scan = new Scanner(System.in);
		System.out.print("복사장소와 파일명:");
		String pathname1 = scan.next();
		System.out.print("붙이기 장소와 파일명:");
		String pathname2 = scan.next();
		
		File file1 = new File(pathname1);
		FileInputStream fis = null;
		BufferedInputStream bis = null;

		File file2 = new File(pathname2);
		FileOutputStream fos =null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(file1);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(file2);
			bos = new BufferedOutputStream(fos);
			
			// 그림, 소리, 동영사 파일들을 처리할때는 무조건 1byte씩 처리하자
			int k=0;
			while((k=bis.read())!=-1) {
				bos.write(k);
			}
			bos.flush();
			
		} catch (Exception e) {
		}finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
				
			} catch (Exception e2) {
			}
		}
	}
}
