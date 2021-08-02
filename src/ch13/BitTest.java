package ch13;

public class BitTest {

	public static void main(String[] args) {
		int num1 = 5;	//0101
		int num2 = 10;	//1010
		
		System.out.println(num1 | num2);
		System.out.println(num1 & num2);
		System.out.println(num1 ^ num2); //xor 같으면0 다르면1
		System.out.println(~num1);
		
		System.out.println(num1 << 2);
		System.out.println(num1);
		System.out.println(num1 <<= 2);
		System.out.println(num1);	
	}

}
