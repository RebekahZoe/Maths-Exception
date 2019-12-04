package Main;

public class DivisionNotAllowedException extends Exception {

	@Override
	public String toString() {
		return "Division Not Allowed Exception has been thrown, "
				+ "the first number must be bigger than the sceond ";
	}

	
	
}
