import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams {

	public static void main(String[] args) {
		
		// Problem Statement = Count of names starts with 'A'
		// Regular way by using for loop
		ArrayList<String> names = new ArrayList<String>();
		names.add("Anand");
		names.add("Bob");
		names.add("Ajay");
		names.add("Ram");
		names.add("Ankita");
		
		int count =0;
		for (int i=0; i<names.size(); i++) {
			String actual = (String)names.get(i);
			if (actual.startsWith("A")) {
				count= count+1;
				//count++
				
			}
		}
		System.out.println("By using regular method "+count);
		
		
System.out.println("********************************************************");		
		
		
		// Using Java Stream().filter() method --> Reduces the code and do optimization
		ArrayList<String> advancedNames = new ArrayList<String>();
		advancedNames.add("Anand");
		advancedNames.add("Bob");
		advancedNames.add("Ajay");
		advancedNames.add("Ram");
		advancedNames.add("Ankita");
		
		// There is no life for intermediate operation if there is no terminal operation
		// Terminal operation will execute only when intermediate operation (.filter()) returns true
		// Data type is long
		long c = advancedNames.stream().filter(x->x.startsWith("A")).count();		// x can be a any variable, data type is long always for .stream().filter()
		System.out.println("By using Java Stream Filter method "+c);				// 
		
		// We can create stream of string instead of creating in regular way
		Stream.of("Mayank", "Mamta","Prachil", "Raj", "Prachi").filter(y->y.startsWith("M")).count();
		System.out.println(Stream.of("Mayank", "Mamta","Prachil", "Raj", "Prachi").filter(y->y.startsWith("M")).count());
		
		
		// Print the names length>3
		names.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));			// .forEach() iterate through each element of newly created stream because of filter() operation
		// Only 2 names not all
		names.stream().filter(s->s.length()>3).limit(2).forEach(s->System.out.println(s));
		
		
		// Print names ends with 'a' in upper case
		Stream.of("Rama", "Lakshman", "Radha", "Shree", "Krish").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));		// .map() method iterate through each new element of Rama and Radha and perform its lambda condition
		
		
		// Create stream of Array and names starts with 'A' and in sorted upper case manner
		List<String> ArrNames = Arrays.asList("Arjun", "Yudhvir", "Yograj", "Krishna");
		ArrNames.stream().filter(s -> s.startsWith("Y")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		
		
		// Merge two different lists advancedNames and ArrNames
		Stream<String> NewStream = Stream.concat(advancedNames.stream(), ArrNames.stream());
		NewStream.sorted().forEach(s -> System.out.println(s));
//		System.out.println(NewStream.anyMatch(s -> s.equalsIgnoreCase("bob")));
		
		
		// Create new list after performing operation instead of printing it
		List<String> ls = Stream.of("Rama", "Lakshman", "Radha", "Shree", "Krish").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls);
		
		
		// Unique numbers in sorted manner
		List<Integer> numbers = Arrays.asList(1,2,3,1,4,2,6,8,2,3,4,1);
		numbers.stream().distinct().sorted().forEach(s -> System.out.println(s));
		// Print number of required index by creating new list
		List<Integer> SortedNum = numbers.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(SortedNum.get(2));
		
		
		
		
	}

}




/*
1. What are Streams?
	Stream API is new feature available from java 8
	By using streams, we can perform various aggregate operations on the data returned from collections classes by drastically reduce the complexity of code

2. What is Lambda Expression?
	Lambda expressions introduce the new arrow operator -> into Java. It divides the lambda expressions in two parts:
	The left side specifies the parameters required by the expression, which could also be empty if no parameters are required.
	The right side is the lambda body which specifies the actions of the lambda expression.

******The working of stream can be explained in three stages:

		--> Create a stream --> advancedNames.stream()
		
		--> Perform intermediate operations on the initial stream to transform it into another stream and so on on further intermediate operations --> .filter(x->x.startsWith("A"))
		
		--> Perform terminal operation on the final stream to get the result --> .count()

An important characteristic of intermediate operations is laziness.
When executing this code snippet, nothing is printed to the console. That is because intermediate operations will only be executed when a terminal operation is present.
*/