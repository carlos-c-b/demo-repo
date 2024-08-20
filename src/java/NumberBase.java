import java.lang.Math;
/* 	
	This class implements methods to transform
	between bases
*/
public class NumberBase {
	// Method to extract the integer part of a double
	public static int integerPart(double number) {
		return (int) number;		
	}

	// Method to extract the fractional part of a double
	// Returns the fractional part as an integer
	public static int fractionalPart(double number) {
		int sizeIntegerPart = (integerPart(number) + "").length() + 1; // adding length of integer part and length of '.'
		char[] original = (number + "").toCharArray();
		int numRedundantZeros = 0;

		for(int i = original.length -1; i >= 0; i--) {
			if(original[i] == '0') {
				numRedundantZeros++;
			} else {
				break;
			}
		}

		char[] end = new char[original.length-numRedundantZeros];
		int j = 0;
		for(int i = sizeIntegerPart; i < end.length; i++) {
			end[j] = original[i];
			j++;
		}
		int result = Integer.parseInt(String.valueOf(end));
		return result;
		
	}

	public static double toBaseTen(double number, int base) {
		double result = 0;
		String numString = number + "";
		int i = 0;
		for(char c : numString.toCharArray()) {
			int coefficient = Integer.parseInt(String.valueOf(c));
			int baseExp = (int) Math.pow(base, numString.length() - 1 - i);
			result += coefficient * baseExp;
			i++;

			System.out.printf("\n\tcoefficient = %d\n\tbaseExp = %d\n\tresult += %d\n", coefficient, baseExp, coefficient*baseExp);
		}
		return result;
	}

	public static void main(String[] args) {
		double num = 12312341.135555;
		System.out.printf("Number: %f\nInteger part: %d\nFractional part: %d\n", num, integerPart(num), fractionalPart(num));
	}
}
