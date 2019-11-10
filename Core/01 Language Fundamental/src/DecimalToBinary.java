package com.company.module.submodule;

public class DecimalToBinary {

	public static void main(String[] args) {
		DecimalToBinary dtb = new DecimalToBinary();
		dtb.binaryConvertor(30);

	}

	public void binaryConvertor(int number) {
		int[] binary = new int[30];
		int index = 0;
		while (number > 0) {
			binary[index++] = number % 2;
			number = number / 2;
		}

		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);

		}
	}

}
