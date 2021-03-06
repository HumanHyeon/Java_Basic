package ch16;

public class SwitchCaseUpTest {

	public static void main(String[] args) {
		int month = 4;
		
		//Java 14부터 지
		int day = switch(month) {	//switch가 식으로 변함(리턴 값을 가짐)
			case 1, 3, 5, 7, 8, 10, 12 -> {
				System.out.println("한 달은 31일입니다.");
				yield 31;	//반환(return이랑 동일)
			}
			case 4, 6, 9, 11 -> //{
				//System.out.println("한 달은 30일 입니다.");
				//yield 30;
				30;
			//}
			case 2 -> {
				System.out.println("한 달은 28일 입니다.");
				yield 28;
			}
			default -> {
				System.out.println("존재하지 않는 달입니다.");
				yield -1;
			}
		};
		System.out.println(month + "월은 " + day + "일 입니다.");
	}

}
