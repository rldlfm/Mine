package myPrc;

import java.util.Scanner;

public class StrToInt {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入数值:");
		String numStr = input.next();
		int num = Integer.parseInt(numStr);// int num = Integer.parseInt(numStr,10);
		System.out.println(numStr);

	}

}
