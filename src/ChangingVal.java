package TicketBox;

import java.util.ArrayList;

public class ChangingVal {
	int TicketType; //day(1) or night(2)
	String TicketType_str;
	String IDnumber; //13 digits of number 
	
	//age
	int Age; //Korean Age
	int Man_Age; //International Age(�� ����)
	int AgeType; //AgeType in number (����, �, û�ҳ�, ���, ����)
	String AgeTypeStr;
	
	int Amount; //the amount of tickets to buy
	//discount
	int DiscountType; //DiscountType 
	String DiscType_Str;
	
	int PriceToPay; //total price to pay 
	
	ArrayList<String> History = new ArrayList<>();
	//recoding EntryTime, AgeType, PurchasingCount, DiscountType, Price
	
}
