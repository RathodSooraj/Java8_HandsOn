package functionalInterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import data.Student;
import data.StudentDataBase;

public class PredicateAndConsumerExample {

	static List<Student> students = StudentDataBase.getAllStudents();

	static Predicate<Student> p1 = t -> t.getGradeLevel() >= 3;
	static Predicate<Student> p2 = t -> t.getGpa() >= 3.9;

	static Consumer<Student> consumer = student -> System.out
			.println(student.getName() + " " + student.getActivities());

	private static void printResult() {
		System.out.println("printResult :");

		students.forEach(student -> {
			if (p1.and(p2).test(student)) {
				consumer.accept(student);
			}
		});

	}

	static BiPredicate<Integer, Double> biPredicate = (grade, gpa) -> grade >= 3 && gpa >= 3.9;
	static BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out
			.println(name + " " + activities);

	private static void printResultByBiPredicateAndBiConsumer() {
		System.out.println("printResultByBiPredicateAndBiConsumer :");
		students.forEach(student -> {
			if (biPredicate.test(student.getGradeLevel(), student.getGpa())) {
				biConsumer.accept(student.getName(), student.getActivities());
			}
		});
	}

	public static void main(String[] args) {
		printResult();
		printResultByBiPredicateAndBiConsumer();
	}

}
