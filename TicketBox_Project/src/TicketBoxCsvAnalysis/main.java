package TicketBoxCsvAnalysis;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class main {
	public static void main(String[] args) throws IOException {
		CSVfileReading csvfile = new CSVfileReading();
		dataAnalyzing analysis = new dataAnalyzing();
		
		ArrayList<String> data = new ArrayList<>();
		
		csvfile.TransferData(data);
		
		analysis.AnalyzeAll(data);
	}
}
