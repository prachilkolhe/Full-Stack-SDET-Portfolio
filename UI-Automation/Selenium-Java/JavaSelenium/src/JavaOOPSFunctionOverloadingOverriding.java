
public class JavaOOPSFunctionOverloadingOverriding {
	
	public void getData(int userID, String userName) {
		System.out.println(userID);
		System.out.println(userName);
	}
	
	public void getData(int userID, int password) {
		System.out.println(userID);
		System.out.println(password);
	}
	
	
	
	
	public static void main(String[] args) {
		JavaOOPSFunctionOverloadingOverriding a= new JavaOOPSFunctionOverloadingOverriding();
		
		a.getData(10, "Prachil");
		a.getData(10, 12345);

	}

}
/*
 1.	Function OverLoading :-
 	When any single class has multiple methods with same method name,
 	but different in 
  					--> No of arguments passing in the method
 					--> Data type of arguments
 	
 2. Function Overriding :-
 	When any method which present same in both parent and child class (same name, same no. of args, same data type of args),
 	When that method is called up in child method then it executes as per declare in child class not as per parent class
 */