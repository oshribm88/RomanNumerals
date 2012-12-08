public class RomanNumerals {
	private static final String[] RCODE = { "M", "CM", "D", "CD", "C", "XC",
			"L", "XL", "X", "IX", "V", "IV", "I" };
	private static final int[] BVAL = { 1000, 900, 500, 400, 100, 90, 50, 40,
			10, 9, 5, 4, 1 };

	public String toRoman(int number) {

		String roman = ""; 
		for (int i = 0; i < RCODE.length; i++) {
			while (number >= BVAL[i]) {
				number -= BVAL[i];
				roman += RCODE[i];
			}
		}
		return roman;

	}

}
