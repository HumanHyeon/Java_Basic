package ch09;

public class LocalVariableInter {

	public static void main(String[] args) {
		//선언과 동시에 초기화 되어야 함
		var i = 10;
		var str = "Hello";
		var f = 1.0;
		
		System.out.println(i);
		System.out.println(str);
		System.out.println(f);
		
		str = "change";
		//str = 987; 다른 타입으로 변경 불가
		System.out.println(str);
		
	}

}
