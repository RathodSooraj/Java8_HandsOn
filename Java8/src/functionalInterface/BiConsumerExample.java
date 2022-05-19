package functionalInterface;

import java.util.List;
import java.util.function.BiConsumer;

import data.Student;
import data.StudentDataBase; 

public class BiConsumerExample {

	public static void printNameAndListOfActivities() {

		BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " " + activities);

		List<Student> students = StudentDataBase.getAllStudents();

		students.forEach(t -> biConsumer.accept(t.getName(), t.getActivities()));
	}

	public static void main(String[] args) {

		BiConsumer<Integer, Integer> multiply = (a, b) -> {
			System.out.println("After Multiplication :" + (a * b));
		};

		BiConsumer<Integer, Integer> division = (a, b) -> System.out.println(" After Division :" + (a / b));

		BiConsumer<Integer, Integer> addition = (a, b) -> System.out.println("After Addition :" + (a + b));

		BiConsumer<String, String> biConsumerString = (a, b) -> System.out
				.println(a.toUpperCase() + " " + b.toUpperCase());

//		multiply.accept(2, 3);
//		division.accept(10, 5);
//		addition.accept(10, 5);

		multiply.andThen(addition).andThen(division).accept(10, 5);

		biConsumerString.accept("vishwas", "Raghu");
		printNameAndListOfActivities();

	}

}
