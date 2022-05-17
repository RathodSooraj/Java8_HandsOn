package lambdas;

/**
 * @author SurajR3
 *
 */
public class RunnableLambdaExample {
	public static void main(String[] args) {

		/**
		 * Prior to java 8
		 */

		Runnable runnable1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside runnable 1");

			}
		};

		new Thread(runnable1).start();

		/**
		 * java 8
		 */

		Runnable runnable2 = () -> {
			System.out.println("Inside runnable 2");
		};

		new Thread(runnable2).start();

		new Thread(() -> System.out.println("Runnable short way")).start();

	}
}
