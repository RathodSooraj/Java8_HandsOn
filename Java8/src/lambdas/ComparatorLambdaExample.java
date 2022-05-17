package lambdas;

import java.util.Comparator;

/**
 * @author SurajR3
 *
 */
public class ComparatorLambdaExample {

	public static void main(String[] args) {

		Comparator<Integer> comparator1 = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};

		System.out.println("Result is :" + comparator1.compare(3, 2));

		/**
		 * using java 8
		 */

		Comparator<Integer> comparatorLambda = (o1, o2) -> o1.compareTo(o2);
		comparatorLambda.compare(3, 2);
		System.out.println("Result with java 8 is :" + comparator1.compare(3, 2));

	}

}
