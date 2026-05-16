
public class JavaOOPS {

	public static void main(String[] args) {
		int k=1;
		for (int i=0; i<4; i++) {
			for (int j=1; j<=4-i; j++) {
				//System.out.println(k);
				System.out.print(k);			// print --> prints on same line
				System.out.print("\t");			// \t --> add tab space in between 
				k++;
			}
			System.out.println("");				// println --> prints on separate line
		}
		
		
System.out.println("*******************************");
		
		int m=1;
		for (int a=1; a<=4; a++) {
			for (int b=1; b<=a; b++) {
				System.out.print(m);
				System.out.print ("\t");
				m++;
			}
			System.out.println("");
		}
		

System.out.println("*******************************");

		for (int c=1; c<=4; c++) {
			for (int d=1; d<=c; d++) {
				System.out.print(d);
				System.out.print("\t");
			}
			System.out.println("");
		}
		

System.out.println("*******************************");

/* Interface (What to do) and Class (How to do)
 * Interface has a method but does not have any body in that method
 * Classes also has a method and body within that
 * Example:- WebDriver driver = new ChromeDriver();
   The WebDriver interface defines the contract (.get(), .click(), .findElement())
   The ChromeDriver class provides the specific implementation for that browser
*/

	}

}
