package TicketBox;

public class ConstVal {
	
	//Age range for the age type
	final static int SeniorMinAge = 65; //senior 65~	
	final static int AdultMinAge = 19; //adult 19~64
//	final static int AdultMaxAge = 64; //adult 19~64
	final static int TeenMinAge = 13; //teen 13~18
//	final static int TeenMaxAge = 18;
	final static int ChildMInAge = 3; //child 3~12
//	final static int ChildMaxAge = 12;
	final static int BabyMaxAge = 2; //baby 1~2
	
	//Ticket Price by age type and entry time
	final static int[] DayPrice = {56000, 47000, 44000, 44000, 0};
	final static int[] NightPrice = {46000, 4000, 37000, 37000, 0};

	//Discount rate
	final static double Discount_Disabled = 0.6;
	final static double Discount_NationalMerit = 0.5;
	final static double Discount_Multichildren = 0.8;
	final static double Discount_Pregnant = 0.85;

}
