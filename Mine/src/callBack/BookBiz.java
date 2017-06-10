package callBack;

public class BookBiz implements IoClient {
	private String filename = "books.data";

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public void save() {
		FileIO myInstance = FileIO.INSTANCE;
		myInstance.write(filename, this);
	}

	/*
	 * 回调函数
	 */
	@Override
	public void remind(boolean succeed) {
		if (succeed == true) {
			System.out.println("数据保存成功。");
		} else {
			System.out.println("数据保存失败!");
		}
	}
}
