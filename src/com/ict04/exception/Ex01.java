package com.ict04.exception;

public class Ex01 {
	public static void main(String[] args) {
		//?��?�� 처리 : Exception
		//			  try ~ catch
		//목적 : 비정?��?��?�� 종료�? ?��?��?��?�� 종료�? ?��?��,
		//		 ?��?�� 발생 ?�� ?��?��?�� ???�� 처리�? ?���??��.
		//?��?�� : try{
		//			?��?���? 발생?�� ?�� ?��?�� 문장;
		//			?��?���? 발생?�� ?�� ?��?�� 문장;
		//			?��?���? 발생?�� ?�� ?��?�� 문장;
		//			}catch(?��?��발생객체 e){
		//			?��?���? 발생?�� ?�� ?��?�� 문장;
		//			}
		try {
			int[] var = {10,20,30};
			for (int i = 0; i <= var.length; i++) {
				System.out.println(1);
				System.out.println(2);
				System.out.println("var["+i+"]=" +var[i]);
				System.out.println(3);
				System.out.println(4);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("?���? ?��?��?��?��?��.");
	}
}
