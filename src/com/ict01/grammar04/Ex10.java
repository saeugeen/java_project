package com.ict01.grammar04;
import java.util.Scanner;

class Ex10 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		esc:
		while (true)
		{
			System.out.print("숫자입력: ");
			int k = sc.nextInt();
			String msg = " ";
			if(k%2 == 0){
				msg ="짝수";
			}else{
				msg ="홀수";
			}
			System.out.println(k+"는"+msg+"입니다");
			while (true)
			{
				System.out.print("계속할까요?(1.yse, 2.No)>>>");
				int k2 = sc.nextInt();
				if(k2 ==1){
					continue esc;
				}else if(k2 ==2){
					break esc;
				}else{
					continue;
				}

			}
		}
		
	}
}
