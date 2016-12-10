import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Test;

public class NextDateTest {
	
	private NextDate trialDate = new NextDate(3,4,1976);

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Test
	public final void testThirtyDayChange(){
	assertEquals("7/1/2001", trialDate.run(6, 30, 2001));
	}
	
	@Test
	public final void testThirtyOneDayChange(){
	assertEquals("4/1/2001", trialDate.run(3, 31, 2001));
	} 
	
	@Test
	public final void testDecemberToJanuary(){
	assertEquals("1/1/2002", trialDate.run(12, 31, 2001));
	}

	@Test
	public final void testInvalidDay() {
		assertEquals("invalid Input Date", trialDate.run(12, 0, 2003));
	}

	@Test
	public final void testIsThirtyOneDayMonth() {
		assertEquals("1/9/2001", trialDate.run(1, 8, 2001));
	}

	@Test
	public final void testIsThirtyOneDayMonthChangeSemanticFailure() {
		assertEquals("invalid Input Date", trialDate.run(1, 33, 2001));
	}

	@Test
	public final void testIsThirtyDayMonth() {
		assertEquals("4/9/2001", trialDate.run(4, 8, 2001));
	}

	@Test
	public final void testIsThirtyDayMonthChangeSemanticFailure() {
		assertEquals("Invalid Input Date", trialDate.run(4, 33, 2001));
	}

	@Test
	public final void testIsDecember() {
		assertEquals("12/9/2001", trialDate.run(12, 8, 2001));
	}
	@Test
	public final void testIsDecemberChangeSemanticFailure() {
		assertEquals("Invalid Input Date", trialDate.run(12, 33, 2001));
	}
	@Test
	public final void testIsDecemberChangeAndYearSemanticFailure() {
		assertEquals("Invalid Next Year", trialDate.run(12, 33, 2021));
	}

	@Test
	public final void testIsFebruary() {
		assertEquals("2/2/2002", trialDate.run(2, 1, 2002));
	}
	@Test
	public final void testIsFebruaryChangeNotLeapYear() {
		assertEquals("3/1/2001", trialDate.run(2, 28, 2001));
	}
	@Test
	public final void testIsFebruaryChangeLeapYear() {
		assertEquals("2/29/2016", trialDate.run(2, 28, 2016));
	}
	@Test
	public final void testIsFebruaryChangeLeapYear2() {
		assertEquals("2/29/2000", trialDate.run(2, 28, 2000));
	}
	@Test
	public final void testIsFebruaryChangeLeapYear1() {
		assertEquals("3/1/2016", trialDate.run(2, 29, 2016));
	}
	@Test
	public final void testIsFebruaryChangeNotLeapYear1() {
		assertEquals("Invalid Input Date", trialDate.run(2, 29, 2015));
	}
	@Test
	public final void testIsFebruaryDayTooBig() {
		assertEquals("Invalid Input Date", trialDate.run(2, 30, 2015));
	}

	/*@Test
	public final void testIsJuly() {
		assertEquals("7/30/2015", trialDate.run(7, 29, 2015));
	}
	*/
}

