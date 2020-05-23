package kkr.leapyear;

public class LeapYear {
	public String isLeapYear(int year) {		
		boolean leapYear = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
		return year + (leapYear ? " is a leap year" : " is not a leap year");
	}
}
