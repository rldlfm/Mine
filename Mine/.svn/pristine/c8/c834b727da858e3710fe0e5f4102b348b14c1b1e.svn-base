
package proxy;

public class Stu {
	private String num;
	private String name;
	private int score;

	public Stu() {
		this.num = "";
		this.name = "";
		this.score = 0;
	}

	public Stu(String num, String name, int score) {
		this.num = num;
		this.name = name;
		this.score = score;
	}

	public String getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Stu))
			return false;
		Stu other = (Stu) obj;

		return (num == other.num) || (num != null && num.equals(other.num));

	}

	@Override
	public String toString() {
		return "[num=" + num + ",name=" + name + ",score=" + score + "]";
	}

}