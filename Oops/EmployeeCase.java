package oops;
class Employ{

	public String emid;
	public String ename;
	public String phno;
	public void showdata()
	{
		System.out.println("THE ID IS:"+emid);
		System.out.println("THE NAME IS:"+ename);
		System.out.println("THE PHONE NO IS:"+phno);
	}
}
class Pay extends Employee{


	public String pancardno;
	public String aadharno;
	public String month;
	public void details(){
		System.out.println("PANCARD NO: "+pancardno);
		System.out.println("AADHAR NO: "+aadharno);
		System.out.println("MONTH: "+month);
		
	}
	public Pay(String emid,String ename,String phno,String pancardno,String aadharno,String month)
	{
		super(emid,ename,phno);
		this.pancardno=pancardno;
		this.aadharno=aadharno;
		this.month=month;
				
		}
	

	public double netpay(double basic,double da,double hra){
		return(basic+hra+da);
	}
}

class PaySlip extends Pay implements Tax
{
	public PaySlip(String emid,String ename,String phno,String pancardno,String aadharno,String month){
	super(emid,ename,phno,pancardno,aadharno,month);
	}
}
public class EmployeeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaySlip p=new PaySlip("abc1","ABCD","12345","ftfyuyu","790559709735","APRIL");
		double total=p.netpay(35000.00, 2500.00, 3000.00);
	}

}
