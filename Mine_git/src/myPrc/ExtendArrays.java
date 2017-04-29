package myPrc;

import java.util.Arrays;

public class ExtendArrays {

	public static void main(String[] args) {
		int[] arr = new int[519];
		int[] arr2 = Arrays.copyOf(arr,520);
		System.out.println(arr2.length);
	}
}
