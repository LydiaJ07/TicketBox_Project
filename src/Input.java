package TicketBox;

import java.util.Scanner;

public class Input {
	Scanner scanner = new Scanner(System.in);
	Output output = new Output();

	public void UserInput(ChangingVal Val) {
		TicketTypeInput(Val);
		IDNumberInput(Val);
		AmountInput(Val);
		DiscountTypeInput(Val);
	}

	public void TicketTypeInput(ChangingVal Val) {
		while (true) {
			System.out.println("권종을 선택하세요.");
			System.out.println("1. 주간권");
			System.out.println("2. 야간권");
			Val.TicketType = scanner.nextInt();

			if (Val.TicketType == 1 || Val.TicketType == 2) break;
			else output.ErrorMsg();
		}
	}

	public void IDNumberInput(ChangingVal Val) {
		while (true) {
			System.out.println("주민번호를 입력하세요");
			scanner.nextLine();
			Val.IDnumber = scanner.nextLine();

			if (Val.IDnumber.length() == 13) break;
			else output.ErrorMsg();
		} 
	}

	public void AmountInput(ChangingVal Val) {
		while (true) {
			System.out.println("몇 개를 주문하시겠습니까? (최대 10개)");
			Val.Amount = scanner.nextInt();

			if (Val.Amount > 0 || Val.Amount < 11) break;
			else output.ErrorMsg();
		} 
	}

	public void DiscountTypeInput(ChangingVal Val) {

		while (true) {
			System.out.println("우대사항을 선택하세요.");
			System.out.println("1. 없음 (나이 우대는 자동처리)");
			System.out.println("2. 장애인");
			System.out.println("3. 국가유공자");
			System.out.println("4. 다자녀");
			System.out.println("5. 임산부");
			Val.DiscountType = scanner.nextInt();

			if (Val.DiscountType > 0 || Val.DiscountType < 5) break;
			else output.ErrorMsg();
		}
	}

	public int ContinueInput() {
		int ContinueChoice = 0;

		while (true) {
			System.out.println("계속 발권 하시겠습니까?");
			System.out.println("1. 티켓 발권");
			System.out.println("2. 종료");
			ContinueChoice = scanner.nextInt();

			if (ContinueChoice == 1 || ContinueChoice == 2) break;
			else output.ErrorMsg();
		}

		return ContinueChoice;
	}

	public int  RestartInput() {
		int RestartChoice = 0;

		while (true) {
			System.out.println("계속 진행 (1: 새로운 주문, 2: 프로그램 종료) :");
			RestartChoice = scanner.nextInt();

			if (RestartChoice == 1 || RestartChoice == 2) break;
			else output.ErrorMsg();
		}

		return RestartChoice;
	}
}
