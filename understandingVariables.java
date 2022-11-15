

public class understandingVariables {

	
	public static void main(String[] args) {

		// Integer data types and their range
		byte byteMax = 127;
		byte byteMin = -128;
		
		short shortMax = 32767;
		short shortMin = -32768;
		
		int max = 2147483647;
		int min = -2147483648;
		
		long longMax = 9223372036854775807L;
		long longMin = -9223372036854775808L;
		
		// Floating(Decimal values) data types and their precision
		float value1 = 1.666666f; // 7 decimal places
		double value2 = 1.6666666666666667d; // 16 decimal places
		
		System.out.println("---Integers---");
		System.out.println("Byte " + byteMax);
		System.out.println("Byte " + byteMin);
		System.out.println("Short " + shortMax);
		System.out.println("Short " + shortMin);
		System.out.println("Int " + max);
		System.out.println("Int " + min);
		System.out.println("Long " + longMax);
		System.out.println("Long " + longMin);
		
		System.out.println("\n---Floating---");
		System.out.println("Float " +value1);
		System.out.println("Double " +value2);
	}

}
