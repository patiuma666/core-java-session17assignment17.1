package assignment17serialization;

import java.io.Serializable;

/*  here the serial version UID is used to store the class version ID , which will take about version of the class 
 *  and it is used in serialization to check whether sender and receiver of the class are loading the same version of the class or not 
 * 
 */

public class EmployeeClass implements Serializable {//creating the class which implements the Serialization 

	public String firstName;  //taken the variable as string type of first name 
	
	
	public String lastName; // taken the variable as string type of second name

	private static final long serialVersionUID = 5462223600l; //taken the serialversionUID 

}