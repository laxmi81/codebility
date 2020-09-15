package javaCodability;
/*Write a java program to Implement tower of hanoi using stack data structure*/

public class tower_of_hanoi {
	public static void move(int n,char rodFrom,char middleRod, char rodTo)
	{
		if(n==1)
		{
			System.out.println("plate 1 from "+rodFrom+" To "+rodTo);
			return;
		}
		move(n-1,rodFrom,rodTo,middleRod);
		System.out.println("plate "+n+" from "+rodFrom+" to "+rodTo);
		move(n-1,middleRod,rodFrom,rodTo);
	}
public static void main(String[] args) {
	tower_of_hanoi test=new tower_of_hanoi();
	int n=3;
	System.out.println("solution of tower of hanoi");
	move(n,'A','B','C');
}
}
