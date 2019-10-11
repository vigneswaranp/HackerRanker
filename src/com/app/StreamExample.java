package com.app;

import static java.util.stream.Stream.of;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.app.model.Person;

public class StreamExample {
	public static void main(String[] args){
		Person[] persons = {new Person("Vicky",1l,"dev"),new Person("Arun", 2l, "test"),new Person("Bala",3l,"dev") };
		Double a = of(1,25,59,58,58,69,47,58)
				.distinct().collect(Collectors.averagingInt(v->v));
		System.out.println(a);
		Map<String,List<Person>> groupByValue = of(persons).collect(Collectors.groupingBy(Person::getDepartment));
		System.out.println(groupByValue.compute("dev", (key,value)-> {
			value.get(0).setName("testt");
			return value;
		}));
		System.out.println(groupByValue);
		System.out.println(of(persons).collect(Collectors.toMap(Person::getId, p->p)));
		OptionalDouble average = IntStream.of(1,5,5,96,956,56).average();
		if(average.isPresent()){
			System.out.println(average.getAsDouble());
		}
		
		
	}
}
