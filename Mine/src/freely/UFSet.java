package freely;

public class UFSet {
	private int[] parent;
	private int size;
	private int countOfSet;

	private void init() {
		for (int i = 0; i < size; ++i) {
			parent[i] = i;
		}
	}

	public UFSet(int size) {
		this.size = countOfSet = size;
		parent = new int[size];
		init();
	}

	public UFSet() {
		this(1024);
	}

	public int find(int id) {
		int r = id, t;
		while (r != parent[r]) {
			r = parent[r];
		}
		while (id != r) {
			t = parent[id];
			parent[id] = r;
			id = t;
		}
		return r;
	}

	public boolean unionSet(int x, int y) {
		x = find(x);
		y = find(y);
		if (x == y) {
			return false;
		} else {
			countOfSet--;
			parent[x] = y;
			return true;
		}
	}

	public int getSetSize() {
		return size;
	}

	public int getCountOfSet() {
		return countOfSet;
	}

}
