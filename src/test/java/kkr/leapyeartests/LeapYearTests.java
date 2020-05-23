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
	private int yearDivisibleByOneHundredButNotByFourHundred = 1800;

	@Before
	public void setUp() throws Exception {
		leapYear = new LeapYear();
	}
	
	@Test
	public void yearDivisibleByFourButNotByHundredAreLeapYears() {
		assertEquals(yearDivisibleByFourButNotByOneHundred + " is a leap year", 
				leapYear.isLeapYear(yearDivisibleByFourButNotByOneHundred));
	}
	
	@Test
	public void yearNotDivisbleByFourAreNotLeapYears() {
		assertEquals(yearNotDivisibleByFour + " is not a leap year", 
				leapYear.isLeapYear(yearNotDivisibleByFour));
	}
	
	@Test
	public void yearDivisibleByFourHundredAreLeapYears() {
		assertEquals(yearDivisibleByFourHundred + " is a leap year", 
				leapYear.isLeapYear(yearDivisibleByFourHundred));
	}
	
	@Test
	public void yearDivisibleByOneHundredButNotByFourHundredAreNotLeapYears() {
		assertEquals(yearDivisibleByOneHundredButNotByFourHundred + " is not a leap year", 
				leapYear.isLeapYear(yearDivisibleByOneHundredButNotByFourHundred));
	}
}
