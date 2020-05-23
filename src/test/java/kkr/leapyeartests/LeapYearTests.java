package kkr.leapyeartests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import kkr.leapyear.LeapYear;

public class LeapYearTests {
	
	private LeapYear leapYear;
	private int yearDivisibleByFourHundred = 2000;
	private int yearDivisibleByFourButNotByOneHundred = 2016;
	private int yearNotDivisibleByFour = 2019;
	private int yearDivisibleByOneHundredButNotByFourHundred = 1700;

	@Before
	public void setUp() throws Exception {
		leapYear = new LeapYear();
	}
	
	@Test
	public void yearsDivisibleByFourButNotByHundredAreLeapYears() {
		assertEquals(yearDivisibleByFourButNotByOneHundred + " is a leap year", 
				leapYear.isLeapYear(yearDivisibleByFourButNotByOneHundred));
	}
	
	@Test
	public void yearsNotDivisbleByFourAreNotLeapYears() {
		assertEquals(yearNotDivisibleByFour + " is not a leap year", 
				leapYear.isLeapYear(yearNotDivisibleByFour));
	}
}
