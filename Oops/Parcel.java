package oops;
class Percel{
	class Contents{
		public double weight(double w){
			return w;
		}
	}
		class Destination{
			public void dest(String ad){
				System.out.println("The Destiny is : "+ad);
			}
		}
	}


public class Parcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Percel pe=new Percel();
		Percel.Contents co = pe.new Contents();
		Percel.Destination ds=pe.new Destination();
		double wp= co.weight(150.00);
		System.out.println("THE WEIGHT IS : "+wp);
		ds.dest("Kolkata");
	}

}
