package TicketBox;

public class Output {

	public void	PricePrint(int price) {
		System.out.printf("������ %d�� �Դϴ�.", price);
		System.out.println("�����մϴ�.\n");
	}

	public void TotalResultPrint(ChangingVal Val) {
		System.out.println("Ƽ�� �߱��� �����մϴ�. �����մϴ�.");
		System.out.println("\n================ �������� ================");
		
		int totalPrice = 0;
		for (int i = 0; i < Val.History.size(); i++) {
			String[] temp = Val.History.get(i).split(",");
			
			totalPrice += Integer.parseInt(temp[4]);
			
			System.out.printf("%s %s X %2s %10s�� ", temp[1], AddGap(temp[2], 6), temp[3], temp[4]);
			if (temp[5].contains("����")) System.out.printf("*������ ����\n");
			else System.out.printf("*%s �������\n", temp[5]);

		}
		System.out.printf("\n����� �Ѿ��� %d�� �Դϴ�.", totalPrice);
		System.out.println("\n========================================");

	}

	public String AddGap(String str, int Byt) {
		str += "                         ";
		byte[] temp= str.getBytes();
		String newStr = new String(temp, 0, Byt);
		return newStr;
	}
	
	public void ErrorMsg() {
		System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
	}
}
