import java.util.*;
public class Armstrong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,d=0,s=0,m;
		System.out.println("Enter a 3 digit number:");
		n=sc.nextInt();
		m=n;
		while(n>0)
		{
			d=n%10;
			s=s+ d*d*d;
			n=n/10;
		}
		if(s==m)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
	}

}
