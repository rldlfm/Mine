package myPrc;

import java.math.BigDecimal;

public class BigDecimalDemo {

	public static void main(String[] args) {
		
		/*��double���͹���BigDecimal����*/
		double b = 3.1415928;
		BigDecimal bd3 = BigDecimal.valueOf(b);
		
		/*�Ƽ�:��String�๹��BigDecimal����*/
		BigDecimal bd = new BigDecimal("3.141592811");
		BigDecimal bd2 = new BigDecimal("0.00001");
		
		
		System.out.println(bd3);
		System.out.println(bd.add(bd2)); // bd + bd2
		System.out.println(bd.subtract(bd2)); // bd - bd2
		System.out.println(bd.multiply(bd2)); // bd * bd2
		System.out.println(bd.divide(bd2)); // bd / bd
		// BigDecimal�Ķ��󲻿ɸı�,�������е����㶼�������µ�BigDecimal����
	}

}
