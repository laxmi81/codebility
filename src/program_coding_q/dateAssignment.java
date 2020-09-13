package program_coding_q;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class dateAssignment {
	/*format date-mm/dd/yyyy
	input=06/06/2016
	after click submit button
	output=06/07/2016*/
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String date1;
		System.out.println("enter date to be increase");
		date1=sc.next();
		System.out.println("click on submit");
		String c;
		c=sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Calendar cal = Calendar.getInstance();
		Date dt=sdf.parse(date1);
		cal.setTime(dt);// Now use today date.
		cal.add(Calendar.DATE, 1); // Adding 5 days
		String output = sdf.format(cal.getTime());
		System.out.println(output);
		
	}
}
