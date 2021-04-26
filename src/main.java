package TickectBox;

public class main {
	public static void main(String[] args) {
		Input input  = new Input();
		Output output = new Output();

		while (true) {
			ChangingVal Val = new ChangingVal();
			
			while (true) {
				input.TicketTypeInput(Val);

				input.IDNumberInput(Val);
				input.PurchasingCount(Val);
				input.DiscountTypeInput(Val);
				int countinue = input.ContinueInput();

				if (countinue == 2) {
					output.TicketBoxEnd(Val);
					break;
				}
				
			}
			int restart = input.RestartInput();
			if (restart == 2) break;
		}
	}
}
