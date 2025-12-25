
/**For Each Problem:
Write logic in comments
Handle basic edge cases
Use proper variable names
Commit code with message: **/  

package codepractice;
    
import java.util.Scanner;    

public class AddTwoNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); //scan the insert variables
		int b = scan.nextInt();
		try {
			System.out.println(a+b);  // sum of the variables
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

}

// add comments to the code including logic of the program
// write the unit test cases 


