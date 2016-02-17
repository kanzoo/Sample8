package example;

import java.util.List;

public class Person {
	private String name;
	private int age;
	private List<Person> children;

	public Person(String name) {
	}

	public Person(String name, int age) {
	}

	public Person(String name, int age, Person... children) {
	}

	@Override
	public String toString() {
	}

}
