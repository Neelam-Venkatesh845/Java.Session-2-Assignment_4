import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		String Month;
		Scanner month = new Scanner(System.in);
		System.out.println("enter the month");
		Month = month.next();
		if (Month.equals("January")){
			System.out.println("It has 31 days");
		}
		else if (Month.equals("February")){
			System.out.println("It has 28 or 29 days");
		}
		else if (Month.equals("March")){
			System.out.println("It has 31 days");
		}
		else if (Month.equals("Aprial")){
			System.out.println("It has 30 days");
		}
		else if (Month.equals("May")){
			System.out.println("It has 31 days");
		}
		else if (Month.equals("June")){
			System.out.println("It has 30 days");
		}
		else if (Month.equals("July")){
			System.out.println("It has 31 days");
		}
		else if (Month.equals("August")){
			System.out.println("It has 31 days");
		}
		else if (Month.equals("September")){
			System.out.println("It has 30 days");
		}
		else if (Month.equals("October")){
			System.out.println("It has 31 days");
		}
		else if (Month.equals("November")){
			System.out.println("It has 30 days");
		}
		else if (Month.equals("December")){
			System.out.println("It has 31 days");
		}

	}

}
