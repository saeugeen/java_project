package com.ict04.exception;

public class Ex01 {
	public static void main(String[] args) {
		//??Έ μ²λ¦¬ : Exception
		//			  try ~ catch
		//λͺ©μ  : λΉμ ?? ?Έ μ’λ£λ₯? ? ?? ?Έ μ’λ£λ‘? ? ?,
		//		 ??Έ λ°μ ? ??Έ? ??? μ²λ¦¬λ₯? ?΄μ€??€.
		//?? : try{
		//			??Έκ°? λ°μ?  ? ?? λ¬Έμ₯;
		//			??Έκ°? λ°μ?  ? ?? λ¬Έμ₯;
		//			??Έκ°? λ°μ?  ? ?? λ¬Έμ₯;
		//			}catch(??Έλ°μκ°μ²΄ e){
		//			??Έκ°? λ°μ?  ? ?? λ¬Έμ₯;
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
		System.out.println("?κ³? ??¨?΅??€.");
	}
}
