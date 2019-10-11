package com.app;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@FunctionalInterface
interface StudentAverage{
	OptionalDouble findAverage(IntStream i);
}
class Person{
	private int mark;
	Person(){}
	Person(int mark){
		this.mark = mark;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
}
public class FunctionInterfaceExample {
	public static void main(String[] args){
		Stream<Person> persons = Stream.of(new Person(15),new Person(25),new Person(35),new Person(45),new Person(55));
		StudentAverage a = IntStream::average;
		System.out.println(a.findAverage(persons.mapToInt(Person::getMark)).getAsDouble());
	}
}