public class RomanNumerals {
	private static final String[] ROME = { "M", "CM", "D", "CD", "C", "XC",
			"L", "XL", "X", "IX", "V", "IV", "I" };
	private static final int[] DEC = { 1000, 900, 500, 400, 100, 90, 50, 40,
			10, 9, 5, 4, 1 };

	public String toRoman(int number) {

		String roman = ""; 
		for (int i = 1; i < ROME.length; i++) {
			while (number >= DEC[i]) {
				number -= DEC[i];
				roman += ROME[i];
			}
		}
		return roman;

	}

}
