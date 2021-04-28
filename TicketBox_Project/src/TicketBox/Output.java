package TicketBox;

public class Output {

	public void	PricePrint(int price) {
		System.out.printf("가격은 %d원 입니다.", price);
		System.out.println("감사합니다.\n");
	}

	public void TotalResultPrint(ChangingVal Val) {
		System.out.println("티켓 발권을 종료합니다. 감사합니다.");
		System.out.println("\n================ 에버랜드 ================");
		
		int totalPrice = 0;
		for (int i = 0; i < Val.History.size(); i++) {
			String[] temp = Val.History.get(i).split(",");
			
			totalPrice += Integer.parseInt(temp[4]);
			
			System.out.printf("%s %s X %2s %10s원 ", temp[1], AddGap(temp[2], 6), temp[3], temp[4]);
			if (temp[5].contains("없음")) System.out.printf("*우대사항 없음\n");
			else System.out.printf("*%s 우대적용\n", temp[5]);

		}
		System.out.printf("\n입장료 총액은 %d원 입니다.", totalPrice);
		System.out.println("\n========================================");

	}

	public String AddGap(String str, int Byt) {
		str += "                         ";
		byte[] temp= str.getBytes();
		String newStr = new String(temp, 0, Byt);
		return newStr;
	}
	
	public void ErrorMsg() {
		System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해주세요.");
	}
}
