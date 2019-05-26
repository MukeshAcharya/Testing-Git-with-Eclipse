 package Introduction;

public class Arrays {

	public static void main(String[] args) {
		//print string in reverse
		String a= "madam";
		String sd="" ;
		
		for (int i=a.length()-1;i>=0;i--)
		{
			System.out.println(a.charAt(i));
			sd=sd+ a.charAt(i);
		}
	
		if(a.equals(sd))
		{
			System.out.println("its a palindrome");
		}else 
		{
			System.out.println("its  not a palindrome");
		}
	}

}  