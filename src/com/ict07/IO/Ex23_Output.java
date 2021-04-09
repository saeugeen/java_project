package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//��ü ����ȭ : ObjectOutputStream : writeObject()
public class Ex23_Output {
	public static void main(String[] args) {
		// ��ü ����ȭ : Ư��Ŭ����(VO)�� ��ü�� ����� Ư����ġ�� .ser ���Ϸ� ���� �����Ѵ�.
		// 				 ��ü���� ������ �ִ� ������ ����ȭ �Ǿ� �ִ�.(����� ������ ����� ���� ����)
		String pathname = "c:"+File.separator+"study"
							+File.separator+"util"+File.separator+"icto7.ser";
		
		File file = new File(pathname);
		FileOutputStream fos =null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			//��ü����ȭ�� �ϱ� ���� ��ü�� ����
			Ex23_VO vo = new Ex23_VO("�Ѹ�", 28, 67.3, true);
			
			//��ü ����ȭ
			oos.writeObject(vo);
			oos.flush();
			
		} catch (Exception e) {
		}finally {
			
		}try {
			oos.close();
			bos.close();
			fos.close();
			
		} catch (Exception e) {
		}
		
	}
}
