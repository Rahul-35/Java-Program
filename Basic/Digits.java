
public class Digits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=1234,d,pos=0,i=0,m;
		m=n;
		while(m>0)
		{
			d=m%10;
			pos++;
		}
		d=0;
		while(n>0)
		{
			d=n%10;
			System.out.println("Digit at"+(pos-i)+"th position is:"+d);
			i++;
		}
	}

}
