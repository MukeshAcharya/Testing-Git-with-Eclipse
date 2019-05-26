package Introduction;

public class HelloWorld {
	
	public HelloWorld()
	{
		
		System.out.println("print anything");
		
	}
	HelloWorld cons=new HelloWorld();
	public static void main(String[] args) {
	
		
		int count=0;
		 for (int i=1;i<=100;i++)
		 {
			 boolean flag=false;
			 for (int num=2;num<i;num++) {
				 
				 if (i%num==0) {
					 flag =true;
					 break;				 
				 }
			 }
		 if (flag ==true) {
			 
		
		 }else {
			 System.out.println("the number is a prime number :"+i);
		 count=count+1;
			 }
	}System.out.println("number of Prime numbers between 1 to 100 are:= "+count);
		 }
	}
		
		