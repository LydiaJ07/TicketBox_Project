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

				//taking all needed information from the user at once
				//using the method InputAll(requires four inputs)
				input.UserInput(Val);

				//calculate and print the ticket price based on user input
				proc.PriceCal(Val);

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
