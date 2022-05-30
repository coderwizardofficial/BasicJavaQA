import java.util.ArrayList;

public class CoreJavaBrushUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = { 2, 4, 1, 6, 4, 8, 9, 11 };
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] % 2 == 0) {
				System.out.println(arr2[i]);

			} else {
				System.out.println(arr2[i] + "is not multiple of 2");
			}

		}
		
		//arraylist
		ArrayList <String> a =new ArrayList();
		//create object of a class= object.method
		
		a.add("coder");
		a.add("Wizard");
		a.add("Inc.");
		a.add("selenium");
		a.remove(1);
		System.out.println(a.get(2));
		

	}

}
