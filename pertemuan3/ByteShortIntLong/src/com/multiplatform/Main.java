package com.multiplatform;

public class Main {

	public static void main(String[] args) {
		int myintValue = 10000;

		int myMaxIntvalue = Integer.MAX_VALUE;
		int myMinIntValue = Integer.MIN_VALUE;
		System.out.println("Interger Maximum Value = " + myMaxIntvalue);
		System.out.println("Integer Minimum Value = " + myMinIntValue);
		System.out.println("Overflow Max Value = " + (myMaxIntvalue + 1));
		System.out.println("Underflow Min Value = " + (myMaxIntvalue - 1));

		byte myMaxBytevalue = Byte.MAX_VALUE;
		byte myMinByteValue = Byte.MIN_VALUE;
		System.out.println("Byte Maximum Value = " + myMaxBytevalue);
		System.out.println("Byte Minimum Value = " + myMinByteValue);

		short myMaxShortvalue = Short.MAX_VALUE;
		short myMinShortValue = Short.MIN_VALUE;
		System.out.println("Short Maximum Value = " + myMaxShortvalue);
		System.out.println("Short Minimum Value = " + myMinShortValue);

		long myMaxLongvalue = Long.MAX_VALUE;
		long myMinLongValue = Long.MIN_VALUE;
		System.out.println("Long Maximum Value = " + myMaxLongvalue);
		System.out.println("Long Minimum Value = " + myMinLongValue);

	}
}
