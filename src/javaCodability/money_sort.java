package javaCodability;

import java.util.Scanner;

/*. Write a program to read monetary amount in cents and print the smallest possible number of coins equaling 
 * the amount. Example: monetary amount in cents=288 2 Dollar 3 quarter 1 dime 3 pennies So smallest possible
 *  number of coins equaling the amount 283====9 coins
 */
public class money_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount;
		Scanner sc=new Scanner(System.in);
  System.out.println("enter monetory amount in the cents");
    amount=sc.nextInt();
    sc.close();
    int d=0,r=0,q=0,dime = 0,p=0;
    if(amount!=0)
    {
    	d=amount/100;
    	r=amount%100;
    	
    	q=r/25;
    	r=r%25;
    
    	dime=r/10;
    	r=r%10;
    	
    	p=r;
    	
    }
    System.out.println("doller= "+d+" quarter= "+q+" dime= "+dime+" pennies= "+p);
	}

}
