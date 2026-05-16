import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreConcepts {

	public static void main(String[] args) {
		// variable --> Mandatory to declared the data type of variables in JAVA
		int var=5;
		String name= "Prachil KOLHE";
		char letter= 'P';
		double decimal= 10.08;
		boolean condition = true;
		
		System.out.println(decimal);
		System.out.println("My name is"+" "+name+" "+"with letter"+" "+letter+" "+"and roll no"+" " +var);
		// + operator is used to concatenate two different data types
		
		
		
		// Arrays --> Used to stored multiple values in single variable
		// New memory is allocated to the variable using 'new' operator
		// Array always starts with 0 index
		int[] arr= new int[4];
		arr[0]= 1;
		arr[1]= 2;
		arr[2]= 3;
		arr[3]= 4;
		
		int[] arr2= {10,20,30,40,50};
		System.out.println(arr);
		System.out.println(arr[2]);
		System.out.println(arr2[0]);
		
		String[] countries= {"India", "Pakistan", "Iran", "UK"};
		
		
		// for loop
		for (int i=0; i< arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		// Enhanced for loop condition
		for (int x:arr)					// In each iteration, each value from the array will be picked up and stored into x 
		{
			System.out.println(x);
		}
				
		
		// Conditional statement in for loop
		for (int y:arr2)
		{
			if (y % 3 == 0)						// at the starting we declared the int data type so now at this line its not required.
			{
				System.out.println(y);
			}	
			else
			{
				System.out.println(y+" "+"is not multiple of 3");
			}
		}
		
		
		// ArrayList
		// Arrays are of fixed size and element can be remove and add in the array
		// ArrayList are dynamic and elements can be added or removed dynamically. And when its gets full then it creates another ArrayList
		// Need to import from java utils
		// ArrayList has different methods which conventional Arrays don't
		ArrayList<String> a = new ArrayList<String>();
		a.add("Rahul");
		a.add("Shetty");
		a.add("Academy");
		a.add("Selenium");
		a.remove(1);
		System.out.println(a);
		System.out.println(a.get(2));
		
		// To check if a element in present in arraylist or not --> Boolean output
		System.out.println(a.contains("Academy"));
		
		// To convert conventional array into ArrayList
		// Need to import List from java utils
		String[] myname= {"Prachil", "Pradip", "Kolhe"};
		List<String> mynameArrayList = Arrays.asList(myname);
		System.out.println(mynameArrayList.contains("Patil"));
		
		
		
		// String
		// String is object which represent the set of characters
		// By 2 types string can be declared:-
		// 1. String Literal --> When two string data types are created with same values then in backend only one data type will be created and no memory allocation to second data type
		// 2. new Keyword --> To create two different data types with same value then need to add 'new' operator
		String m= "Academy";
		String n= "Academy";  					// No memory allocation for this data type, it will always redirect to m object. Here m and n are the same objects
		String o= new String("Welcome");
		String p= new String("Welcome");		// Here two different data types are created with same value and separate memory allocation. Here o and p are different objects with same value
		
		String s= "My name is Prachil Kolhe";
		//String[] SplittedString = s.split(" ");
		String[] SplittedString = s.split("is");
		System.out.println(SplittedString[0]);
		System.out.println(SplittedString[0].trim());
		
		//loop to print each char of the string
		for (int i=0; i<s.length(); i++)
		//for (int i=s.length()-1; i>=0; i--) 		// Prints the string in the reverse order
		{
			System.out.println(s.charAt(i));
		}
		
		
		
		
	}

}


/*
 Data Types has two types ==> Primitive and Non-Primitive Data types
 Primitive Data Type --> Predefined by JAVA
 					 --> Used to stored the value
 					 --> int, char, float, double, long, short, boolean, byte
 Non-Primitive Data Type --> Not defined by language 
 						 --> Don't used to store the value in object
 						 --> Used to stored the reference to the object
						 --> It can be NULL
						 --> String, Arrays, Classes, Interfaces, Enums
*/