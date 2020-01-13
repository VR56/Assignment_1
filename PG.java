import java.util.*;

abstract class PayingGuest{
	abstract void cupBoards();
	abstract void beds();
	abstract void AirConditioner();
}

class twoSharingWithAC extends PayingGuest
{
	void cupBoards()
	{
		System.out.println("two cupboards");
	}

	void beds()
	{
		System.out.println("two beds");
	}

	void AirConditioner()
	{
		System.out.println("YES");
	}
}

class twoSharingWithoutAC extends PayingGuest
{
		void cupBoards()
	{
		System.out.println("two cupboards");
	}

	void beds()
	{
		System.out.println("two beds");
	}

	void AirConditioner()
	{
		System.out.println("NO");
	}	
}

class threeSharingWithAC extends PayingGuest
{
		void cupBoards()
	{
		System.out.println("three cupboards");
	}

	void beds()
	{
		System.out.println("three beds");
	}

	void AirConditioner()
	{
		System.out.println("YES");
	}
}

class threeSharingWithoutAC extends PayingGuest
{
		void cupBoards()
	{
		System.out.println("three cupboards");
	}

	void beds()
	{
		System.out.println("three beds");
	}

	void AirConditioner()
	{
		System.out.println("NO");
	}
}

class PG{

	public static void main(String[] args) {
		PayingGuest pg;

		pg=new twoSharingWithAC();
		System.out.println("*****TWO SHARING WITH AC*****");
		pg.cupBoards();
		pg.beds();
		pg.AirConditioner();

		pg=new twoSharingWithoutAC();
		System.out.println("*****TWO SHARING WITHOUT AC*****");
		pg.cupBoards();
		pg.beds();
		pg.AirConditioner();

		pg=new threeSharingWithAC();
		System.out.println("*****THREE SHARING WITH AC*****");
		pg.cupBoards();
		pg.beds();
		pg.AirConditioner();

		pg=new threeSharingWithoutAC();
		System.out.println("*****THREE SHARING WITHOUT AC*****");
		pg.cupBoards();
		pg.beds();
		pg.AirConditioner();
	}
}