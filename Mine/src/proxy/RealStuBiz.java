package proxy;

import java.util.ArrayList;

public class RealStuBiz implements AbstractStuBiz {
	ArrayList<Stu> stuList;

	public RealStuBiz() {
		stuList = new ArrayList<Stu>();
	}

	public void add(Stu s) {
		if (!stuList.contains(s)) {
			stuList.add(s);
		}
	}

	public void del(Stu s) {
		stuList.remove(s);
	}

	@Override
	public void showAll() {
		for (int i = 0; i < stuList.size(); ++i) {
			String ss = stuList.get(i).toString();
			System.out.println(ss);
		}

	}
}