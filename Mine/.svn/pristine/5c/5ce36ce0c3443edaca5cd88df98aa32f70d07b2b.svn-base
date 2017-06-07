package proxy;

import java.util.Scanner;

public class Driver {

	public Driver() {
	}

	public static void main(String[] args) {
		RealStuBiz realStuBiz = new RealStuBiz();
		AbstractStuBiz addStuBiz = new ProxyAddStuBiz(realStuBiz);
		System.out.println("请输入学生的学号,姓名,分数:");
		String num, name;
		int score;
		Scanner input = new Scanner(System.in);
		num = input.next();
		name = input.next();
		score = input.nextInt();
		addStuBiz.add(new Stu());
		addStuBiz.add(new Stu(num, name, score));
		addStuBiz.add(new Stu(null, name, score));
		addStuBiz.showAll();
		addStuBiz.del(new Stu());
		input.close();
	}

}