package callBack;

public class Main {
	public static void main(String[] args) {
		BookBiz bz = new BookBiz();
		// ....
		bz.setFilename("books.data");
		bz.save();
		System.out.println("main-thread继续执行");
	}

}
