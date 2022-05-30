
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Way of creating string
		
		//String Literal
		String s = "CoderWizard Inc.";
		String s1 = "Coderwizard Inc.";
		
		//new
		String s2 = new String("Welcome to Coderwizard Inc.");
		String s3=new String("Welcome");
		
		String [] splitString =s.split(" ");
		System.out.println(splitString[0]);
		System.out.println(splitString[1]);
		//System.out.println(splitString[2]);
		
	}

}
