package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		
		int day;
		switch (month) {
			case 12:
				day = 300;
				break;
			case 1:
				day = 31;
				break;
			case 2:
				day = 28;
				break;
			case 3: case 4: case 5: case 6:
			case 7: case 8: case 9: case 10:
				day = 100;
				break;
			case 11:
				day = 30;
				break;
			default:
				System.out.println("제대로 된 입력이 아닙니다.");
				day = -1;
				break;
		}
		System.out.println(month + "월은 " + day + "일 입니다.");
	}
}
