package functionalInterface;

import java.util.List;
import java.util.function.Consumer;

import data.Student;
import data.StudentDataBase;

/**
 * @author SurajR3
 *
 */
public class ConsumerExample {

	static Consumer<Student> printDataConsumer = (student) -> System.out.println(student);
	static Consumer<Student> consumer = t -> System.out.println(t.getName() + " " + t.getActivities());
	static Consumer<Student> c1 = t -> System.out.println(t.getName());
	static Consumer<Student> c2 = t -> System.out.println(t.getActivities());

	public static void printStudent() {

		Consumer<Student> printDataConsumer = (student) -> System.out.println(student);

		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach(printDataConsumer);

	}

	public static void printNameAndActivities() {

		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach(consumer);
	}
//	same can be achieve with the help of consumer chaining

	public static void printNameAndActivitiesWithChaning() {
		System.out.println("print with condition");

		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach(c1.andThen(c2));
	}

	public static void printNameAndActivitiesWithCondition() {
		List<Student> students = StudentDataBase.getAllStudents();

		students.forEach(student -> {
			if (student.getGradeLevel() >= 3) {
				c1.andThen(c2).accept(student);
			}
		});

	}

	public static void main(String[] args) {

//		printStudent();

//		printNameAndActivities();

//		printNameAndActivitiesWithChaning();

		printNameAndActivitiesWithCondition();

	}
}
