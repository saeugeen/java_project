package test;

import java.io.*;
import java.util.Scanner;

public class Ex {
	public static void main(String[] args) {
		// ��� ������ ���� �� ���̱� �ϴ� ���
		Scanner scan = new Scanner(System.in);
		System.out.print("������ҿ� ���ϸ�:");
		String pathname1 = scan.next();
		System.out.print("���̱� ��ҿ� ���ϸ�:");
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
			
			// �׸�, �Ҹ�, ������ ���ϵ��� ó���Ҷ��� ������ 1byte�� ó������
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
