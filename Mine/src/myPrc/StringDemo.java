package myPrc;

public class StringDemo {

	public static void main(String[] args) {
		String string = "[";
		string = string.concat("Hello,Wrold!]"); //不改变字符串的内容,而是返回一个新建的字符串;
		System.out.println(string);
		
		char[] chs = string.toCharArray();//返回内部字符数组的副本
		for (int i = 0; i < chs.length; ++i)
			System.out.print(chs[i]);
		System.out.println();
		String s =  string.toUpperCase(); //!不改变string其内容
		// s = string.toLowerCase();
		System.out.println(s);

	}

}
