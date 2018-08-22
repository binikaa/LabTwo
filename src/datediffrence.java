import java.util.Scanner;
import java.time.*;
public class datediffrence {

	public static void main(String[] args)
	{
		
		String dateOne,dateTwo;
		Scanner scnr= new Scanner(System.in);
		System.out.println("Please enter first date in mm/dd/yyyy format");
		dateOne = scnr.nextLine();
		System.out.println("Please enter second date in mm/dd/yyyy format");
		dateTwo = scnr.nextLine();
		String numYear1=dateOne.substring(6);
		int year1 = Integer.parseInt(numYear1);
		
		String numYear2=dateTwo.substring(6);
		int year2= Integer.parseInt(numYear2);
		
		String numDay1=dateOne.substring(3,5);
		int day1 = Integer.parseInt(numDay1);
	
		String numDay2=dateTwo.substring(3,5);
		int day2= Integer.parseInt(numDay2);
	
		String numMonth1=dateOne.substring(0,2);
		int month1 = Integer.parseInt(numMonth1);
	
		String numMonth2=dateTwo.substring(0,2);
		int month2= Integer.parseInt(numMonth2);
		
		LocalDate FirstDate= LocalDate.of(year1, month1, day1);
		LocalDate SecondDate= LocalDate.of(year2, month2, day2);
		
		Period p =Period.between(FirstDate,SecondDate);
		System.out.printf("Number of years are %d, Numberof months are %d and days are %d", p.getYears(),p.getMonths(),p.getDays())
		;
		
		
	}
}
