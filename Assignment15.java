
class Person
{
	String sName;
	int iDay,iMonth,iYear;
	public Person(String sTemp,int iTd,int iTm,int iTy)
	{
		sName=sTemp;
		iDay=iTd;
		iMonth=iTm;
		iYear=iTy;	
	}
	public void displayDetails()
	{
		System.out.println("Name:"+sName);
		System.out.println("DOJ:"+iDay+"-"+iMonth+"-"+iYear);
	}
	
}


public class Assignment15 extends Person
{
	int iEmpNo;
	double dSalary;
	public Assignment15(int empId,String ename,int eday,int emonth,int eyear,double sal)
	{
		super(ename,eday,emonth,eyear);
		iEmpNo=empId;
		dSalary=sal;
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Employee Id: "+iEmpNo);
		System.out.println("Salary :"+dSalary);
	}
	public static void main(String[] args)
	{
		Person objectPerson=new Person("Aswan",28,12,2015);
		objectPerson.displayDetails();
		
		Assignment15 objectEmployee=new Assignment15(111,"Sanu",03,03,2015,48000);
		objectEmployee.displayDetails();
		objectPerson=objectEmployee;
		objectPerson.displayDetails();
	}

}
