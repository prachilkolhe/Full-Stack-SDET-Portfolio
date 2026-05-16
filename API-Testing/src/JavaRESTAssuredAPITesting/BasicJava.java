package JavaRESTAssuredAPITesting;

public class BasicJava {

	public static void main(String[] args) {
		
		// Check if given string is palindrome or not
		String str1 = "madam";
		String str2 = "";
		for (int i=str1.length()-1; i>=0; i--) {
			str2 = str2 + str1.charAt(i);
		}
		System.out.println("String 2 is: " + str2);
		System.out.println("String 1 is: " + str1);
		
		if (str2.equals(str1)) {
			System.out.println("Given string is palindrome");
		} else {
			System.out.println("Given string is not a palindrome");
		}

	}

}
