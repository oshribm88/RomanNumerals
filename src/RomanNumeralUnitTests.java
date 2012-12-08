import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests {

	private RomanNumerals number = new RomanNumerals();

	@Test
	public void testThat1ReturnsI() {
		assertEquals("I", number.toRoman(1));
		assertEquals("II", number.toRoman(2));
		assertEquals("IV", number.toRoman(4));
		assertEquals("IX", number.toRoman(9));
		assertEquals("IX", number.toRoman(9));
		assertEquals("XXX", number.toRoman(30));
		assertEquals("LV", number.toRoman(55));
		assertEquals("LXXI", number.toRoman(71));
		assertEquals("LXXXV", number.toRoman(85));
		assertEquals("XCIV", number.toRoman(94));
		assertEquals("XCIV", number.toRoman(94));
		assertEquals("XCIV", number.toRoman(94));
		assertEquals("DL", number.toRoman(550));
		assertEquals("DCCLXXVIII", number.toRoman(778));
		assertEquals("MDLXXVI", number.toRoman(1576));
		assertEquals("MMCMXCIV", number.toRoman(2994));





	}
	

}
