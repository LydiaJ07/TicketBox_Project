package TicketBoxCsvAnalysis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class printAnalysis {

	public void printCSV(String[] header, ArrayList data) {
		System.out.println("================ ����� �Ǹ� ���.csv ================");
		System.out.printf("%-7s %-5s %-5s %-3s %-4s  %-5s\n", header[0], header[1], header[2], 
				header[3], header[4], header[5]);
		for(int i = 0; i < data.size(); i=i+6) {
			System.out.printf("%-9s %-4s %s %3s   %-6s  %-5s\n", data.get(i), data.get(i+1), 
					printwithblank((String)data.get(i+2), 9), data.get(i+3), data.get(i+4), data.get(i+5));
		}
		System.out.println("======================================================");

	}

	public void printDailySales(HashSet date, int[] salesdata) {
		Iterator iterator = date.iterator();

		System.out.println("\n================ ���ں� ���� ��Ȳ ================");

		for (int i = 0; i < date.size(); i++) {
			String dateToPrint = (String) iterator.next();
			System.out.printf("%s�� %s�� %s�� ���� : %s\n", dateToPrint.substring(0, 4), 
					dateToPrint.substring(4, 6), dateToPrint.substring(6), salesdata[i]);
		}
		System.out.println("==================================================");

	}

	public static String printwithblank(String str, int byt) {
		String temp = str + "                     ";
		byte[] tempinByte = temp.getBytes(); 
		str = new String(tempinByte, 0, byt); 

		return str; 
	}

	public void printTicketTypeAndAgeType(String[] TicketType, int[] TicketTypeCnt,
			int[] TicketTypeSales, String[] AgeType, int[] AgeTypeCntDay, int[] AgeTypeCntNight ) {

		System.out.println("\n================ ���� �� �Ǹ���Ȳ ================");
		System.out.printf("%s �� %d��\n", TicketType[0], TicketTypeCnt[0]);
		for (int i = 0; i < AgeType.length; i++) {
			System.out.printf("%s %d�� ", AgeType[i], AgeTypeCntDay[i]);
		}
		System.out.printf("\n%s ���� : %d��\n", TicketType[0], TicketTypeSales[0]);
		
		System.out.printf("\n\n%s �� %s��\n", TicketType[1], TicketTypeCnt[1]);
		for (int i = 0; i < AgeType.length; i++) {
			System.out.printf("%s %d�� ", AgeType[i], AgeTypeCntNight[i]);
		}
		System.out.printf("\n%s ���� : %d��", TicketType[1], TicketTypeSales[1]);
		System.out.println("\n==================================================");
	}

	public void printDiscType(String[] DiscType, int[]DiscTypeCnt,int totalSaleNum) {
		System.out.println("\n================ ���� �Ǹ� ��Ȳ ================");
		System.out.printf("�� �Ǹ� Ƽ�ϼ�       : %4d��", totalSaleNum); 
		for (int i = 0; i < DiscType.length; i++) 
			System.out.printf("\n%s     : %4d��", printwithblank(DiscType[i], 16), DiscTypeCnt[i]);
		System.out.println("\n==================================================");

	}
}
