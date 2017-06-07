
package proxy;

public class ProxyAddStuBiz implements AbstractStuBiz {

	private RealStuBiz realStuBiz;

	public ProxyAddStuBiz(RealStuBiz realStuBiz) {
		this.realStuBiz = realStuBiz;
	}

	@Override
	public void add(Stu s) {
		realStuBiz.add(s);
	}

	@Override
	public void del(Stu s) {
		System.out.println("No permission to delete student");
	}

	@Override
	public void showAll() {
		realStuBiz.showAll();
	}

}