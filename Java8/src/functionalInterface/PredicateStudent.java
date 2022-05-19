package functionalInterface;

import java.util.List;
import java.util.function.Predicate;

import data.Student;
import data.StudentDataBase;

/**
 * @author SurajR3
 *
 */
public class PredicateStudent {

	static Predicate<Student> s1 = t -> t.getGradeLevel() >= 3;

	static Predicate<Student> s2 = t -> t.getGpa() >= 3.9;

	static List<Student> students = StudentDataBase.getAllStudents();

	private static void printGradeLeverResult() {
		System.out.println("printGradeLeverResult :");

		students.forEach(s -> {
			if (s1.test(s)) {
				System.out.println(s);
			}
		});

	}

	private static void printGpaLevelResult() {
		System.out.println("printGpaLevelResult :");
		students.forEach(s -> {
			if (s2.test(s)) {
				System.out.println(s);
			}
		});

	}

	private static void checkGradeLevelAndGpa() {
		System.out.println(" checkGradeLevelAndGpa :");
		students.forEach(t -> {
//			if (s1.and(s2).test(t)) {
//			if (s1.or(s2).test(t)) {
			if (s1.or(s2).negate().test(t)) {
				System.out.println(t);
			} else {
				System.out.println(t); 
			}
		});
	}

	public static void main(String[] args) {
		printGradeLeverResult();
		printGpaLevelResult();
		checkGradeLevelAndGpa();
	}

}
