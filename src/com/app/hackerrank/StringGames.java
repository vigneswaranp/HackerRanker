package com.app.hackerrank;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StringGames {
	public static void main(String[] args){
		String paragraphs = "All the best friends. You could do it by yourself!!!";
		System.out.println(paragraphs.replaceAll("\\s+",""));
		Optional<String> longestWord = Stream.of(paragraphs.split("\\s"))
		.max(Comparator.comparingInt(String::length));
		System.out.println(longestWord.get());
		long numberOfE = paragraphs.chars()
							.filter(i-> ((char) i)=='e')
							.count();
		System.out.println(numberOfE);
		long numberOfCharacterDigits = paragraphs.chars()
										.filter(Character::isDigit)
										.count();
		System.out.println(numberOfCharacterDigits);
		long numberOfWords = Stream.of(paragraphs.split("\\s")).count();
		System.out.println(numberOfWords);
		long numberOfSentences = Stream.of(paragraphs.split("\\.")).count();
		System.out.println(numberOfSentences);
	}
}
