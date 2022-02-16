package com.org.gen.day7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcateStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList = new ArrayList<String>();

		stringList.add("One flew over the cuckoo's nest");
		stringList.add("To kill a muckingbird");
		stringList.add("Gone with the wind");

		Stream<String> stream1 = stringList.stream();

		List<String> stringList2 = new ArrayList<>();
		stringList2.add("Lord of the Rings");
		stringList2.add("Planet of the Rats");
		stringList2.add("Phantom Menace");

		Stream<String> stream2 = stringList2.stream();

		Stream<String> concatStream = Stream.concat(stream1, stream2);

		List<String> stringsAsUppercaseList = concatStream
		        .collect(Collectors.toList());

		System.out.println(stringsAsUppercaseList);
	}

}
