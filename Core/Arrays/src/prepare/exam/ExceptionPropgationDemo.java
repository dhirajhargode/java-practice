package prepare.exam;

import java.io.*;

class ExceptionPropgationDemo {

	public static void handleCheckedException() throws FileNotFoundException {

		throw new FileNotFoundException();

	}

	public static void handleUncheckedException() {

		throw new NullPointerException();

	}

	public static void methodOne() throws FileNotFoundException {
		try {
			handleCheckedException();
		} catch (FileNotFoundException e) {
			throw e;
		} catch (Exception e) {
			throw e;
		}
	}

	public static void main(String[] args) {

		try {
			methodOne();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

		try {
			handleUncheckedException();
		} catch (NullPointerException e) {
			System.out.println(e);
		}

	}

}
