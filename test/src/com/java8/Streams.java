package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	public static void main(String[] args) {
	List<String> nameList = new ArrayList<>(Arrays.asList("Omkar","Awes","Vishal","Anil"));
	System.out.println(nameList);
	System.out.println();
	System.out.println("Name length less than 5");
	System.out.println(nameList.stream().filter(name->name.length()<=4).collect(Collectors.toList()));
	System.out.println();
	System.out.println("Added Developer to string");
	System.out.println(nameList.stream().map(name->name.concat(" Developer")).collect(Collectors.toList()));
	System.out.println();
	System.out.println("Sort list in ascending");
	System.out.println(nameList.stream().sorted().collect(Collectors.toList()));
	System.out.println();
	System.out.println("Sort list in descending");
	System.out.println(nameList.stream().sorted((name1,name2)->name2.compareTo(name1)).collect(Collectors.toList()));
	}
}
