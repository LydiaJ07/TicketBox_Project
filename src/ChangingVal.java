package TicketBox;

import java.util.ArrayList;

public class ChangingVal {
	//TicketType
	int TicketType; //1-2
	String TicketType_str;//day, night
	
	String IDnumber; //13 digits of number 
	
	//age
	int Age; //Korean Age
	int Man_Age; //International Age(�� ����)
	int AgeType; //0-4
	String AgeType_str; //����, �, û�ҳ�, ���, ����
	
	int Amount; //the amount of tickets to buy
	
	//discount
	int DiscountType; //1-5
	String DiscType_str; //����, �����, ����������, ���ڳ�, �ӻ��
	
	int PriceToPay; //total price to pay 
	
	ArrayList<String> History = new ArrayList<>();
	//recoding current time, TicketType_str, AgeType_str, Amount, DiscType_str, Price 
	//written in one String item with comma as separator
	
}
