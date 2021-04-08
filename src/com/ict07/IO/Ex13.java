package com.ict07.IO;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex13 {
	public static void main(String[] args) {
		// DataOutputStream과 DataOutputStream
		// 기본자료형을 주고 받을 때 사용(기본 자료형을 읽고 쓰는 메소드가 별도로 존재)
		// FileInputStream 과 FileOutputStream과 다른 점은
		// 이진데이터(0,1)를 입출력할때 사용한다.(타시스템과 입출력할때 유리)
		// **입력 순서와 출력 순서가 다르면 데이터의 결과가 달라질수 있다.
		// BufferedInputStream과 BufferedOutputStream을 활용할 수있다.
		
		String pathname = "C:" +File.separator+"study"+File.separator+"util"
							+File.separator + "ict03.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			//쓰는 메소드 : writeXXX (XXX는 기본자료형을 말한다.)
			//메모장으로 열기를 해도 읽을 수가 없다.
			dos.writeLong(126L);
			dos.writeBoolean(true);
			dos.writeFloat(3.14f);
			dos.writeInt(256);
			dos.writeDouble(236.41);
			dos.writeChar('A');
			dos.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				dos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}
}
