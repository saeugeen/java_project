package test;

import java.io.*;
import java.util.Scanner;

public class CopyTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("복사장소와 파일명:");
		String pathname1 = scan.next();
		System.out.print("붙이기 장소와 파일명:");
		String pathname2 = scan.next();
		
		File file1 = new File(pathname1);
		File file2 = new File(pathname2);
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw =null;
		BufferedWriter bw = null;
		
		try {	
			fr = new FileReader(file1);
			br = new BufferedReader(fr);
			String msg = null;
			StringBuffer sb = new StringBuffer();
			
			while((msg = br.readLine())!=null) {
				sb.append(msg+"\n");
			}
			
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
			
			String str = sb.toString();
			
			bw.write(str);
			bw.flush();
			
			
			
		} catch (Exception e) {
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch (Exception e2) {
			}
		}
	}
}
