package Main;

public class App {

	public static void main(String[] args) {
		
		try {
			System.out.println(Maths.divison(5, 0));
		} catch (DivisionNotAllowedException dnae) {
			System.out.println(dnae.toString());
		} catch (ArithmeticException ae) {
			System.out.println(ae.toString());
			System.out.println("Can't divide by Zero");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
}
