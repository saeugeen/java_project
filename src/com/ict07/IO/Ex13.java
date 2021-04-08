package com.ict07.IO;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Ex13 {
	public static void main(String[] args) {
		// DataOutputStream�� DataOutputStream
		// �⺻�ڷ����� �ְ� ���� �� ���(�⺻ �ڷ����� �а� ���� �޼ҵ尡 ������ ����)
		// FileInputStream �� FileOutputStream�� �ٸ� ����
		// ����������(0,1)�� ������Ҷ� ����Ѵ�.(Ÿ�ý��۰� ������Ҷ� ����)
		// **�Է� ������ ��� ������ �ٸ��� �������� ����� �޶����� �ִ�.
		// BufferedInputStream�� BufferedOutputStream�� Ȱ���� ���ִ�.
		
		String pathname = "C:" +File.separator+"study"+File.separator+"util"
							+File.separator + "ict03.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			//���� �޼ҵ� : writeXXX (XXX�� �⺻�ڷ����� ���Ѵ�.)
			//�޸������� ���⸦ �ص� ���� ���� ����.
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
