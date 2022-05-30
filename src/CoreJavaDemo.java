
public class CoreJavaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Dta tyypes and variables
		int num = 5;
		String myString = "Coderwizard Inc.";
		char myChar = 'p';
		boolean myBool = true;

		System.out.println(num);
		System.out.println(myString);
		System.out.println(myBool);
		System.out.println(myChar);

		// Array-
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 6;

		// another way of creating array

		int[] arr2 = { 1, 9, 3, 8, 5 };
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		
		//for loop 
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		//Array of string 
		String [] names = {"Hello", "I am Coder", "Wizard"};
		for(int i= 0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		//enhanced for loop
		for (String s:names) {
			System.out.println(s);
		}
		
		
		

	}

}
