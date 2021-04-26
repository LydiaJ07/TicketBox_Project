package TicketBox;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Processing {
	ConstVal cv = new ConstVal();
	Output output = new Output();
	Calendar cal = Calendar.getInstance();

	public void recording(ChangingVal Val) {
		SimpleDateFormat df = new SimpleDateFormat("yyyMMdd");
		String temp ="";
		temp += df.format(cal.getTime()) + ",";
		temp += Val.TicketType_str + ",";
		temp += Val.AgeTypeStr +",";
		temp += String.valueOf(Val.Amount) + ",";
		temp += String.valueOf(Val.PriceToPay) + ",";
		temp += Val.DiscType_Str;
		Val.History.add(temp);
	}
	public void DefineTicketType(ChangingVal Val) {
		if (Val.TicketType == 1) Val.TicketType_str = "�ְ���";
		else Val.TicketType_str = "�߰���";
	}

	public void CalculatingAge(ChangingVal Val) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);

		int birthYear = 0;
		int birthMonth = Integer.parseInt(Val.IDnumber.substring(2, 4));
		int birthDay = Integer.parseInt(Val.IDnumber.substring(4, 6));

		String birthYearTwodigits;

		//�ѱ��� ���� ����ϱ�
		//�ֹε�Ϲ�ȣ 7��° �ڸ��� 1 Ȥ�� 2���, 1900���� 
		if (Val.IDnumber.charAt(6) == '1' || Val.IDnumber.charAt(6) == '2') {
			birthYearTwodigits = Val.IDnumber.substring(0, 2);
			birthYear = 1900 + Integer.parseInt(birthYearTwodigits);

			//�ֹε�Ϲ�ȣ 7��° �ڸ��� 3 Ȥ�� 4���, 2000����
		} else if (Val.IDnumber.charAt(6) == '3' || Val.IDnumber.charAt(6) == '4') {
			birthYearTwodigits = Val.IDnumber.substring(0, 2);
			birthYear = 2000 + Integer.parseInt(birthYearTwodigits);	
		}
		Val.Age = year - birthYear + 1;

		//�� ���� ����ϱ�
		if (month <= birthMonth) {
			if (month == birthMonth && day < birthDay) {
				Val.Man_Age = Val.Age - 2;
			} else if (month == birthMonth && day >= birthDay) {
				Val.Man_Age = Val.Age - 1;
			} else {
				Val.Man_Age = Val.Age - 2;
			}
		} else {
			Val.Man_Age = Val.Age - 1;
		}

	}

	public void DefineAgeType(ChangingVal Val) {
		if (Val.Man_Age >= cv.SeniorMinAge) {
			Val.AgeType = 0;
			Val.AgeTypeStr = "����";
		} else if (Val.Man_Age >= cv.AdultMinAge) {
			Val.AgeType = 1;
			Val.AgeTypeStr = "�";
		} else if (Val.Man_Age >= cv.TeenMinAge) {
			Val.AgeType = 2;
			Val.AgeTypeStr = "û�ҳ�";
		} else if (Val.Man_Age >= cv.ChildMInAge) {
			Val.AgeType = 3;
			Val.AgeTypeStr = "���";
		} else if (Val.Man_Age <= cv.BabyMaxAge) {
			Val.AgeType = 4;
			Val.AgeTypeStr = "����";
		}
	}

	public void CalculatingPrice(ChangingVal Val) {
		int price = 0;
		double discount_rate = 0;

		if (Val.TicketType == 1) {
			price = cv.DayPrice[Val.AgeType - 1];
		} else if (Val.TicketType == 2) {
			price = cv.NightPrice[Val.AgeType - 1];
		}

		if (Val.DiscountType == 1) {
			discount_rate = 1.0;
			Val.DiscType_Str = "����";
		} else if (Val.DiscountType == 2) {
			discount_rate = cv.Discount_Disabled;
			Val.DiscType_Str = "�����";
		} else if (Val.DiscountType == 3) {
			discount_rate = cv.Discount_NationalMerit;
			Val.DiscType_Str = "����������";
		} else if (Val.DiscountType == 4) {
			discount_rate = cv.Discount_Multichildren;
			Val.DiscType_Str = "���ڳ�";
		} else if (Val.DiscountType == 5) {
			discount_rate = cv.Discount_Pregnant;
			Val.DiscType_Str = "�ӻ��";
		} 

		Val.PriceToPay = (int) (price * discount_rate * Val.Amount);
		
		output.PricePrint(Val.PriceToPay);
	}
}
