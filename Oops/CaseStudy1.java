package oops;
class Student2
{
	public int rollno;
	public String sname;
	public Student2(int rollno,String sname)
	{
		this.rollno=rollno;
		this.sname=sname;
		
	}
	public void show(){
		System.out.println("ROLL NO IS :"+rollno);
		System.out.println("NAME IS:"+sname);
	}
}
class Marks1 extends Student2{
	String sub1;
	String sub2;
	String sub3;
	public Marks1(int rollno,String sname,String sub1,String sub2,String sub3)
	{
		super(rollno,sname);
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		
	}
	public int Score(int p,int r,int q){
		return(p+q+r);
	}
	public void Display()
	{
		System.out.println("SUBJECT1 IS: "+sub1);
		System.out.println("SUBJECT2 IS: "+sub2);
		System.out.println("SUBJECT3 IS: "+sub3);
	}
}
class Result extends Marks1 implements Sports{
	public Result(int rollno,String sname,String sub1,String sub2,String sub3){
		super(rollno,sname,sub1,sub2,sub3);
	}
	public int credit(int c){
		return(c);
	}
}
public class CaseStudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result re=new Result(123,"ABCD","PHY","MATHS","CHEM");
		int total=re.Score(50, 60, 90);	
		int cr=re.credit(25);
		int res=total+cr;
		re.show();
		re.Display();
		System.out.println("THE FINAL RESULT IS:"+res);
		}
	}


