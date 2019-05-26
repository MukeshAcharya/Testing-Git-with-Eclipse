package Introduction;

public class LoopsPractise {

	public static void main(String[] args) {
	
		int numdays=numOfDays(2003,2);

	System.out.println("Number of days in month" +numdays);
		
	}
		
	static int numOfDays(int year,int month) {
	int numdays= 0;
	
	switch(month) {
	case 1:
		numdays=31;
		break;
		
	case 2:
		if(year % 400==0) {
	numdays=29;
		}	else {numdays =28; 
		}
		break;
	case 3:
		numdays=31;
		break;
	case 4:
		numdays=30;
		break;
	case 5:
		numdays=31;
		break;
	case 6:
		numdays=30;
		break;
	case 7:
		numdays=31;
		break;
	case 8:
		numdays=31;
		break;
	case 9:
		numdays=30;
		break;
	case 10:
		numdays=31;
		break;
	case 11:
		numdays=30;
		break;
	case 12:
		numdays=31;
		break;
		default:
			System.out.println("Please enter value between 1 to 12");
		break;
		
		
	}
return numdays;
	
	}
}

	
	
