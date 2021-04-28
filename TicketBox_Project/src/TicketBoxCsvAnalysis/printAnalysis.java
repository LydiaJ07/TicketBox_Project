package TicketBoxCsvAnalysis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class printAnalysis {

	public void printCSV(String[] header, ArrayList data) {
		System.out.println("================ 입장권 판매 기록.csv ================");
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

		System.out.println("\n================ 일자별 매출 현황 ================");

		for (int i = 0; i < date.size(); i++) {
			String dateToPrint = (String) iterator.next();
			System.out.printf("%s년 %s월 %s일 매출 : %s\n", dateToPrint.substring(0, 4), 
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

		System.out.println("\n================ 권종 별 판매현황 ================");
		System.out.printf("%s 총 %d매\n", TicketType[0], TicketTypeCnt[0]);
		for (int i = 0; i < AgeType.length; i++) {
			System.out.printf("%s %d매 ", AgeType[i], AgeTypeCntDay[i]);
		}
		System.out.printf("\n%s 매출 : %d원\n", TicketType[0], TicketTypeSales[0]);
		
		System.out.printf("\n\n%s 총 %s매\n", TicketType[1], TicketTypeCnt[1]);
		for (int i = 0; i < AgeType.length; i++) {
			System.out.printf("%s %d매 ", AgeType[i], AgeTypeCntNight[i]);
		}
		System.out.printf("\n%s 매출 : %d원", TicketType[1], TicketTypeSales[1]);
		System.out.println("\n==================================================");
	}

	public void printDiscType(String[] DiscType, int[]DiscTypeCnt,int totalSaleNum) {
		System.out.println("\n================ 우대권 판매 형황 ================");
		System.out.printf("총 판매 티켓수       : %4d매", totalSaleNum); 
		for (int i = 0; i < DiscType.length; i++) 
			System.out.printf("\n%s     : %4d매", printwithblank(DiscType[i], 16), DiscTypeCnt[i]);
		System.out.println("\n==================================================");

	}
}
