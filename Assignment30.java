class HelloWorld{
	private int iRollNo;
	private String sName;

	public void setrollNo(int iTempRollNo){
		this.iRollNo = iTempRollNo;
	}

	public void setName(String sName){
		this.sName = sName;
	}

	public int getRollNo(){
		return iRollNo;
	}

	public String getName(){
		return sName;
	}
	public static void main(String args[]){
		HelloWorld objStudent=new HelloWorld();
		objStudent.setrollNo(39977);
		System.out.println(objStudent.getRollNo());
	}
}
