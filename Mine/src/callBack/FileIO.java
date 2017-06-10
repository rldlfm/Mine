package callBack;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public enum FileIO {
	INSTANCE;
	private String filename;
	private IoClient client;

	public void write(final String filename, final IoClient client) {
		this.filename = filename;
		this.client = client;

		new Thread(new Runnable() {
			@Override
			public void run() {
				boolean doWriteIt = false;
				File file = new File(filename);
				if (file.exists()) {
					try {
						Thread.sleep(233);
					} catch (InterruptedException e) {
					}
					System.err.println("文件已存在，是否覆盖?(Y/N):");
					Scanner sc = new Scanner(System.in);
					String ans = sc.next();
					if (ans.equalsIgnoreCase("Y")) {
						doWriteIt = true;
					}
					sc.close();
				} else {
					doWriteIt = true;
				}

				if (doWriteIt) {
					writeIt();
				} else {
					client.remind(false);
				}

			}
		}).start();
		;

	}

	private void writeIt() {
		try {
			OutputStream os = new FileOutputStream(filename);
			byte[] bs = { 'a', 'b', 'c' };
			os.write(bs);
			os.close();
			client.remind(true);
		} catch (IOException e) {
			client.remind(false);
		}
	}

}
