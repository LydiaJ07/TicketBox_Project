package TicketBox;

import java.io.IOException;

public class main {
	public static void main(String[] args) throws IOException {
		Input input  = new Input();
		Output output = new Output();
		Processing proc = new Processing();
		FileWriting fw  = new FileWriting();

		fw.headerWrite();

		while (true) {
			ChangingVal Val = new ChangingVal();

			while (true) {
				//Ticket Type
				input.TicketTypeInput(Val);
				input.IDNumberInput(Val);
				input.PurchasingCount(Val);
				input.DiscountTypeInput(Val);
				
				proc.DefineTicketType(Val);
				proc.CalculatingAge(Val);
				proc.DefineAgeType(Val);
				proc.CalculatingPrice(Val);
				
				proc.recording(Val);

				int countinue = input.ContinueInput();

				if (countinue == 2) {
					output.TotalResultPrint(Val);
					fw.FileWrite(Val);
					break;
				}
				
			}
			int restart = input.RestartInput();
			if (restart == 2) {
				fw.fileClose(); 
				break;
			}
		}
	}
}
