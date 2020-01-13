import java.util.*;

interface PayingGuest{
	 void cupBoards();
	 void beds();
	 void AirConditioner();
}

class twoSharingWithAC implements PayingGuest
{
	public void cupBoards()
	{
		System.out.println("two cupboards");
	}

	public void beds()
	{
		System.out.println("two beds");
	}

	public void AirConditioner()
	{
		System.out.println("YES");
	}
}

class twoSharingWithoutAC implements PayingGuest
{
	public void cupBoards()
	{
		System.out.println("two cupboards");
	}

	public void beds()
	{
		System.out.println("two beds");
	}

	public void AirConditioner()
	{
		System.out.println("NO");
	}	
}

class threeSharingWithAC implements PayingGuest
{
	public void cupBoards()
	{
		System.out.println("three cupboards");
	}

	public void beds()
	{
		System.out.println("three beds");
	}

	public void AirConditioner()
	{
		System.out.println("YES");
	}
}

class threeSharingWithoutAC implements PayingGuest
{
	public void cupBoards()
	{
		System.out.println("three cupboards");
	}

	public void beds()
	{
		System.out.println("three beds");
	}

	public void AirConditioner()
	{
		System.out.println("NO");
	}
}

class PG2{

	public static void main(String[] args) {
		PayingGuest pg;

		twoSharingWithAC pg_one=new twoSharingWithAC();
		System.out.println("*****TWO SHARING WITH AC*****");
		pg_one.cupBoards();
		pg_one.beds();
		pg_one.AirConditioner();

		twoSharingWithoutAC pg_two=new twoSharingWithoutAC();
		System.out.println("*****TWO SHARING WITHOUT AC*****");
		pg_two.cupBoards();
		pg_two.beds();
		pg_two.AirConditioner();

		threeSharingWithAC pg_three=new threeSharingWithAC();
		System.out.println("*****THREE SHARING WITH AC*****");
		pg_three.cupBoards();
		pg_three.beds();
		pg_three.AirConditioner();

		threeSharingWithoutAC pg_four=new threeSharingWithoutAC();
		System.out.println("*****THREE SHARING WITHOUT AC*****");
		pg_four.cupBoards();
		pg_four.beds();
		pg_four.AirConditioner();
	}
}