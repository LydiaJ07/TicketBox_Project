package TicketBoxCsvAnalysis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class CSVfileReading {
	public File file;
	public static BufferedReader br;
	
	public static printAnalysis print;
	
	CSVfileReading() throws FileNotFoundException {
		file = new File("입장권 판매 기록.csv");
		br = new BufferedReader(new FileReader(file));
		
		print = new printAnalysis();
	}

	public static void TransferData(ArrayList data) throws IOException {
		String firstline = br.readLine();
		String[] field_name = firstline.split(",");
		
		String line;
		
		while ((line = br.readLine()) != null) {
			String[] temp = line.split(","); 
			
			for (int i = 0; i < temp.length; i++) {
				data.add(temp[i]);
			}	
		}
		
	print.printCSV(field_name, data);
	
	}

}
