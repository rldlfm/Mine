package genericity;

public class Main {

	public static void main(String[] args) {
		show(1);//�Զ�װ��Integer
		show(0.0); //�Զ�װ��Double
		show("123");
		show(new Test());
	}

	public static <T> void show(T t) {
		System.out.println(t.getClass().getSimpleName());
		System.out.println(t);
		System.out.println();
	}

}
