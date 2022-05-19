package functionalInterface;

import java.util.function.Predicate;

/**
 * @author SurajR3
 *
 */
public class PredicateExample {

	static Predicate<Integer> p1 = t -> t % 2 == 0;
	static Predicate<Integer> p2 = t -> t % 5 == 0;

	private static void andPredicate() {
		System.out.println("Result is :" + p1.and(p2).test(4));
	}

	private static void orPredicate() {
		System.out.println("Result is :" + p1.or(p2).test(10));
	}

	private static void negatePredicate() {
		System.out.println("Result is :" + p1.or(p2).negate().test(10));
	}

	public static void main(String[] args) {
		System.out.println(p1.test(4));
		System.out.println(p1.test(3));

		andPredicate();
		orPredicate();
		negatePredicate();
	}

}
