package TicketBox;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileWriting {
	private FileWriter fw;
	boolean fileExistence;

	public FileWriting() throws IOException {
		File file = new File("C:\\Users\\정소영\\Desktop\\입장권 판매 기록.csv");

		if (file.exists() == false) fileExistence = false;
		else fileExistence = true;

		fw = new FileWriter(file, true);					
	}

	public void fileClose() throws IOException {
		fw.close();
	}

	public void headerWrite() throws IOException {
		if (fileExistence == false) {
			String header = "날짜,권종,연령구분,수량,가격,우대사항\n";
			fw.write(header);
		} 
	}

	public void FileWrite(ChangingVal Val) throws IOException {
		
		for (int i = 0; i < Val.History.size(); i++) {
			fw.write(Val.History.get(i) + "\n");
		}
	}
}
