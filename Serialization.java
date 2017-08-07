
/*serialization is the process of converting an object's state to a sequence of bytes
 * Serialization is used when you want to persist the object.
 */

package assignment17serialization; //creating the package name as assignment17serialization

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {  //creating the  main class name as Serialization
         
	public static void main (String[]args){ //creating the main method 
		
		EmployeeClass employee = new EmployeeClass();   //here creating the EmployeeClass object which implemented  the  serializable interface
		
		employee.firstName  = "Uma Maheshwari"; //assigning the  employee first name 
		employee.lastName = "Prashanti";    //and second name
 
		try {
			FileOutputStream fileOut = new FileOutputStream("d:/employee.txt"); //creating the file object  output stream  and given the file name as employee.txt in d: drive to 
			
			ObjectOutputStream out = new ObjectOutputStream(fileOut); //creating the object of the output stream  such that the file will be saved and gives the file out
			
			out.writeObject(employee); //here we passing the object of the employee
			
			
			out.close(); //here closing the object out put stream 
			fileOut.close();//and here file out stream 
			
			System.out.println("serialization file saved successfully in employee file"); //gives the output as the  serialization file saved successfully
			
			System.out.println("First Name of Employee: " + employee.firstName); //displays the first name of the employee
			
			System.out.println("Last Name of Employee: " + employee.lastName);//displays the second name of the employee
		
		}
		catch (IOException i) { //has it throws an file output stream exception to handle that exception we are using try catch block
			i.printStackTrace();
		}
	}
}


