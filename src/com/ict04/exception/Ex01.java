package com.ict04.exception;

public class Ex01 {
	public static void main(String[] args) {
		//?˜ˆ?™¸ ì²˜ë¦¬ : Exception
		//			  try ~ catch
		//ëª©ì  : ë¹„ì •?ƒ? ?¸ ì¢…ë£Œë¥? ? •?ƒ? ?¸ ì¢…ë£Œë¡? ?œ ?„,
		//		 ?˜ˆ?™¸ ë°œìƒ ?‹œ ?˜ˆ?™¸?— ???•œ ì²˜ë¦¬ë¥? ?•´ì¤??‹¤.
		//?˜•?‹ : try{
		//			?˜ˆ?™¸ê°? ë°œìƒ?•  ?ˆ˜ ?žˆ?Š” ë¬¸ìž¥;
		//			?˜ˆ?™¸ê°? ë°œìƒ?•  ?ˆ˜ ?žˆ?Š” ë¬¸ìž¥;
		//			?˜ˆ?™¸ê°? ë°œìƒ?•  ?ˆ˜ ?žˆ?Š” ë¬¸ìž¥;
		//			}catch(?˜ˆ?™¸ë°œìƒê°ì²´ e){
		//			?˜ˆ?™¸ê°? ë°œìƒ?•  ?ˆ˜ ?žˆ?Š” ë¬¸ìž¥;
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
		System.out.println("?ˆ˜ê³? ?•˜?…¨?Šµ?‹ˆ?‹¤.");
	}
}
