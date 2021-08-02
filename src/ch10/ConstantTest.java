package ch10;

public class ConstantTest {

	public static void main(String[] args) {
		final var MAX_NUM = 100;
		int MIN_NUM = 1;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM = 1000;
		MIN_NUM = 10;
		System.out.println(MIN_NUM);
	}

}
