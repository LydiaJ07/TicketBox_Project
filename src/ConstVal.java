package TickectBox;

public class ConstVal {
	
	//Age Type
	final static int Senior = 0;
	final static int Adult = 1;
	final static int Teen = 2;
	final static int child = 3;
	final static int Baby = 4;

	//Age range for the age type
	final static int SeniorMinAge = 65; //senior 65~	
	final static int AdultMinAge = 19; //adult 19~64
	final static int AdultMaxAge = 64; //adult 19~64
	final static int TeenMinAge = 13; //teen 13~18
	final static int TeenMaxAge = 18;
	final static int ChildMInAge = 3; //child 3~12
	final static int ChildMaxAge = 12;
	final static int BabyMaxAge = 2; //baby 1~2
	
	//Ticket Price by age type and entry time
	final static int SeniorDayPrice = 56000;
	final static int SeniorNightPrice = 56000;
	final static int AdultDayPrice = 56000; 
	final static int AdultNightPrice  = 46000;
	final static int TeenDayPrice = 47000;
	final static int TeenNightPrice = 56000;
	final static int ChildDayPrice = 56000;
	final static int ChildNightPrice = 56000;
	final static int BabyPrice = 0; //free for age under 2 

	//Discount rate
	final static double Discount_Disabled = 0.6;
	final static double Discount_NationalMerit = 0.5;
	final static double Discount_Multichildren = 0.8;
	final static double Discount_Pregnant = 0.85;

}
