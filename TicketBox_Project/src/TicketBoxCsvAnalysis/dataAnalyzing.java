package TicketBoxCsvAnalysis;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class dataAnalyzing {
	printAnalysis print = new printAnalysis();
	
	public void AnalyzeAll(ArrayList data) {
		DailySales(data);
		TicketTypeAndAgeType(data);
		DiscType(data);
	}

	public void DailySales(ArrayList data) {
		HashSet<String> date = new HashSet<>();

		for (int i = 0; i < data.size(); i= i+6) { 
			date.add((String) data.get(i));
		}

		Iterator iterator = date.iterator();

		int[] salesdata = new int[date.size()];
		int i = 0;

		while (iterator.hasNext()) {
			String dateToCheck = (String) iterator.next();
			for (int j = 0; j < data.size(); j=j+6) {
				if (dateToCheck.equals(data.get(j))) salesdata[i] += Integer.parseInt((String) data.get(j + 4));
			}
			i++;
		}
		print.printDailySales(date, salesdata);
	}

	public void TicketTypeAndAgeType(ArrayList data) {
		String[] TicketType = {"주간권", "야간권"};
		int[] TicketTypeCnt = new int[TicketType.length];
		int[] TicketTypeSales = new int[TicketType.length];

		String[] AgeType = {"경로", "어른", "청소년", "어린이", "유아"};
		int[] AgeTypeCntDay = new int[AgeType.length];
		int[] AgeTypeCntNight = new int[AgeType.length];

		for (int i  = 0; i < data.size(); i=i+6) {
			if (data.get(i+1).equals(TicketType[0])) {
				TicketTypeCnt[0]++;
				TicketTypeSales[0] += Integer.parseInt((String) data.get(i+4));

				for (int j = 0; j < AgeTypeCntDay.length; j++) {
					if (data.get(i+2).equals(AgeType[j])) AgeTypeCntDay[j]++;
				}
			} else {
				TicketTypeCnt[1]++;
				TicketTypeSales[1] += Integer.parseInt((String) data.get(i+4));
				
				for (int j = 0; j < AgeTypeCntNight.length; j++) {
					if (data.get(i+2).equals(AgeType[j])) AgeTypeCntNight[j]++;
				}
			}
		}

		print.printTicketTypeAndAgeType(TicketType, TicketTypeCnt, TicketTypeSales, AgeType, AgeTypeCntDay, AgeTypeCntNight);
	}

	public void DiscType(ArrayList data) {
		String[] DiscType = {"없음", "장애인", "국가유공자", "다자녀", "임산부"};
		int[] DiscTypeCnt = new int[DiscType.length];
		
		int totalSaleNum = data.size()/6;
		for (int i = 0; i < DiscType.length; i++) {
			for (int j = 5; j < data.size(); j=j+6) {
				if (DiscType[i].equals(data.get(j))) DiscTypeCnt[i]++;
			}
		}
		print.printDiscType(DiscType, DiscTypeCnt, totalSaleNum);
	}
}
