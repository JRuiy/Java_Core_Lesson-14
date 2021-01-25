package ua.lviv.lgs;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Set<Student> setStudent = new HashSet<Student>();

		setStudent.add(new Student("Ivan", 55));
		setStudent.add(new Student("Yana", 30));
		setStudent.add(new Student("Egor", 27));
		setStudent.add(new Student("Vika", 78));
		setStudent.add(new Student("Alex", 14));

		System.out.println("До сортування");

		for (Student student : setStudent) {
			System.out.println(student);
		}

		System.out.println();

		TreeSet<Student> studentTree = new TreeSet<Student>(new StudentSortAllFieldComaparator());
		studentTree.addAll(setStudent);
		System.out.println("Сортування за допомогою Comparator");

		for (Student student : studentTree) {
			System.out.println(student);
		}

		System.out.println();
		System.out.println("Сортування за допомогою Comparable");

		TreeSet<Student> studentTree2 = new TreeSet<Student>();

		studentTree2.addAll(setStudent);
		for (Student student : studentTree2) {
			System.out.println(student);
		}

	}

}
