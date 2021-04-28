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
			System.out.println("������ �����ϼ���.");
			System.out.println("1. �ְ���");
			System.out.println("2. �߰���");
			Val.TicketType = scanner.nextInt();

			if (Val.TicketType == 1 || Val.TicketType == 2) break;
			else output.ErrorMsg();
		}
	}

	public void IDNumberInput(ChangingVal Val) {
		while (true) {
			System.out.println("�ֹι�ȣ�� �Է��ϼ���");
			scanner.nextLine();
			Val.IDnumber = scanner.nextLine();

			if (Val.IDnumber.length() == 13) break;
			else output.ErrorMsg();
		} 
	}

	public void AmountInput(ChangingVal Val) {
		while (true) {
			System.out.println("�� ���� �ֹ��Ͻðڽ��ϱ�? (�ִ� 10��)");
			Val.Amount = scanner.nextInt();

			if (Val.Amount > 0 || Val.Amount < 11) break;
			else output.ErrorMsg();
		} 
	}

	public void DiscountTypeInput(ChangingVal Val) {

		while (true) {
			System.out.println("�������� �����ϼ���.");
			System.out.println("1. ���� (���� ���� �ڵ�ó��)");
			System.out.println("2. �����");
			System.out.println("3. ����������");
			System.out.println("4. ���ڳ�");
			System.out.println("5. �ӻ��");
			Val.DiscountType = scanner.nextInt();

			if (Val.DiscountType > 0 || Val.DiscountType < 5) break;
			else output.ErrorMsg();
		}
	}

	public int ContinueInput() {
		int ContinueChoice = 0;

		while (true) {
			System.out.println("��� �߱� �Ͻðڽ��ϱ�?");
			System.out.println("1. Ƽ�� �߱�");
			System.out.println("2. ����");
			ContinueChoice = scanner.nextInt();

			if (ContinueChoice == 1 || ContinueChoice == 2) break;
			else output.ErrorMsg();
		}

		return ContinueChoice;
	}

	public int  RestartInput() {
		int RestartChoice = 0;

		while (true) {
			System.out.println("��� ���� (1: ���ο� �ֹ�, 2: ���α׷� ����) :");
			RestartChoice = scanner.nextInt();

			if (RestartChoice == 1 || RestartChoice == 2) break;
			else output.ErrorMsg();
		}

		return RestartChoice;
	}
}
