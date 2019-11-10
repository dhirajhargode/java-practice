package com.company.module.submodule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
**********************************************************************************
* PROBLEM STATEMENT: *
* ------------------ *
* The following numbers represents the corresponding type of Objects *
* 1 -> represents Mobile *
* 2 -> represents Personal Computer *
* 3 -> represents Personal Tab *
* *
* Given input: 1 1 2 3 3 2 2 *
* Write a program in java to find how many Mobile instances, *
* Personal Comupter instances and Personal Tab instances are given as input. *
* Example: 1 1 2 3 3 2 2 *
* Output would be 2 2 3 *
* as 2 Mobile instances, 2 Personal Computer instances *
* and 3 Personal Tab instances *
* *
**********************************************************************************
*/

/*
* **************************************
* DO NOT EDIT THE FOLLOWING CLASS NAME *
* **************************************
*/
public class ChallengeCode {
	/*
	 * *************************************************** IN THE FOLLOWING METHOD
	 * YOU NEED TO ADD YOUR CODE * DO NOT RENAME THE FOLLOWING METHOD *
	 * ***************************************************
	 */
	static void printComputingDevicesCount(final List<Object> computingDevices) {
		int mobiles = 0;
		int personalComputers = 0;
		int personalTabs = 0;

		for (int index = 0; index < computingDevices.size(); index++) {
			Object computingDevice = computingDevices.get(index);
			if ( computingDevice instanceof Mobile ) {
				mobiles = mobiles + 1;
			}
			if (computingDevice instanceof PersonalComputer) {
				personalComputers = personalComputers + 1;
			}
			if (computingDevice instanceof PersonalTab) {

				personalTabs = personalTabs + 1;
			}
		}
		System.out.println(mobiles + " " + personalComputers + " " + personalTabs);
	}

	/*
	 * ********************************** DO NOT EDIT THE FOLLOWING METHOD *
	 * **********************************
	 */
	private static List<Integer> stringToList(final String line) {
		String[] arrayString = line.split(" ");
		List<Integer> arrayOne = new ArrayList<>();
		for (String a : arrayString) {
			arrayOne.add(Integer.parseInt(a));
		}
		return arrayOne;
	}

	/*
	 * ********************************** DO NOT EDIT THE FOLLOWING METHOD *
	 * **********************************
	 */
	private static int[] convertToInt(final List<Integer> integerList) {
		int[] intArray = new int[integerList.size()];
		for (int i = 0; i < integerList.size(); i++) {
			intArray[i] = integerList.get(i);
		}
		return intArray;
	}

	/*
	 * ********************************** DO NOT EDIT THE FOLLOWING METHOD *
	 * **********************************
	 */
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		int[] inputInts = convertToInt(stringToList(br.readLine()));
		List<Object> computingDevices = new ArrayList<>();
		isr.close();
		for (int index = 0; index < inputInts.length; index++) {
			switch (inputInts[index]) {
			case 1:
				computingDevices.add(new Mobile());
				break;
			case 2:
				computingDevices.add(new PersonalComputer());
				break;
			default:
				computingDevices.add(new PersonalTab());
			}
		}
		printComputingDevicesCount(computingDevices);
	}

}

/*
 * ************************************** DO NOT EDIT THE FOLLOWING CLASS NAME *
 * **************************************
 */
class Mobile {
}

/*
 * ************************************** DO NOT EDIT THE FOLLOWING CLASS NAME *
 * **************************************
 */
class PersonalComputer {
}

/*
 * ************************************** DO NOT EDIT THE FOLLOWING CLASS NAME *
 * **************************************
 */
class PersonalTab {
}
