package Introduction;

public class Strings {
	


	public static void main(String[] args) {
		//there are two ways of creating object
		//it is always good to create object from method 1 rather than second
		//the object created from method one utilize memory better than method 2
		//as it is using string constant pool
		//
		/*first method*/
		String Str1 = "Hello ";
		
		/* second method*/
		String Str2 = "Welcome";
//Below we are practicing String Methods
		
	String Str ="This is a test of String";
	System.out.println(Str.length());
	System.out.println(Str.charAt(7));
	System.out.println(Str.concat(Str1+Str2));
	System.out.println(Str.contains("h"));
	System.out.println(Str.startsWith(Str2));
	System.out.println("Lower case: " +Str.toLowerCase());
	System.out.println("Upper case: "+Str.toUpperCase());
	System.out.println(Str.trim ());
	System.out.println(Str.substring(10));
	}
public static void TestingObject(){
	int y=0;
	int K=y+5;
	if (K<4) {
		System.out.println("The value of K is less then 4" +K);
	}else 
		System.out.println("The value of k is greater than 4" +K);

}
}
