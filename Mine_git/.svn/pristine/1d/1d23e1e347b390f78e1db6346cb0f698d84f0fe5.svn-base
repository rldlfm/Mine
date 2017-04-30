package myPrc;

import java.math.BigDecimal;

public class BigDecimalDemo {

	public static void main(String[] args) {
		
		/*用double类型构造BigDecimal对象*/
		double b = 3.1415928;
		BigDecimal bd3 = BigDecimal.valueOf(b);
		
		/*推荐:用String类构造BigDecimal对象*/
		BigDecimal bd = new BigDecimal("3.141592811");
		BigDecimal bd2 = new BigDecimal("0.00001");
		
		
		System.out.println(bd3);
		System.out.println(bd.add(bd2)); // bd + bd2
		System.out.println(bd.subtract(bd2)); // bd - bd2
		System.out.println(bd.multiply(bd2)); // bd * bd2
		System.out.println(bd.divide(bd2)); // bd / bd
		// BigDecimal的对象不可改变,所以所有的运算都将返回新的BigDecimal对象
	}

}