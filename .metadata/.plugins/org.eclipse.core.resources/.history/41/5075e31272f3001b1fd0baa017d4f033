package ch11;

public class RealtionalTest {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);	//i부분은 증가하지 않음 short circuit evaluation(단락 회로 평가)
	
		boolean value2 = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
		
		System.out.println(value2);
		System.out.println(num1);
		System.out.println(i);	//i부분 증가 
	}

}
