package Main;

public class Maths {
	
	public static double divison(int numberOne, int numberTwo) throws DivisionNotAllowedException, ArithmeticException, Exception {
		if (numberOne > numberTwo) {
			double result = numberOne / numberTwo;
			return result;
		} else {
			throw new DivisionNotAllowedException();
		}

	}

}
